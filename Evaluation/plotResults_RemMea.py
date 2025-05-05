import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from pathlib import Path

## input parameters
# Set global figure size
figSize = (7,5)

# Set globa figure font size
fntSize = 18

# set global defaults for tick font size
plt.rcParams['xtick.labelsize'] = fntSize - 2
plt.rcParams['ytick.labelsize'] = fntSize - 2

# set the global font
plt.rcParams['font.family'] = 'serif'
plt.rcParams['font.serif'] = ['Times New Roman']

# path to the results with an inactive policy
inactiveCSVInPath = Path("./csvs/RemMea/1832Inactive/allCandidates0_2025-05-02-183110.csv")

# path to the data with an active policy
# activeCSVInPath = Path("./csvs/RemMea/0446/allCandidates2_2025-05-03-044615.csv")
activeCSVInPath = Path("./csvs/RemMea/1327/allCandidates2_2025-05-03-132722.csv")

# specify figure output directory
figOutPath = Path("./plots/RemMea/")

# pareto front indices
idxParetoFront = [1, 8, 7, 4, 6] # manualy determined from 1327

# chosen candidate index
idxChosenCand = 8

# bar chart DoFs
# barChartDoFs = ['StepAdjustmentDegreeImpl:StepAdjustment[TRANSIENT]', 'ExpectedCPUUtilizationDegreeImpl:ExpectedPercentage[TRANSIENT]', 'TargetGroupSizeMaxConstraintDegreeImpl:TargetGroupSizeConstraint[TRANSIENT]', 'CooldownTimeConstraintDegreeImpl:CooldownConstraint[TRANSIENT]']
barChartDoFs = ['StepAdjustmentDegreeImpl:StepAdjustment[TRANSIENT]', 'ExpectedCPUUtilizationDegreeImpl:ExpectedPercentage[TRANSIENT]', 'CooldownTimeConstraintDegreeImpl:CooldownConstraint[TRANSIENT]']

# short DoF names for x-axis of the bar chart
# barChartDoFNames = ['step adjustement size', 'expected CPU utilization', 'max target group size', 'cooldown time']
barChartDoFNames = ['step adjustement size', 'expected CPU utilization', 'cooldown time']

## load data
# load the results of the inactive policy
inactiveData = pd.read_csv(inactiveCSVInPath, delimiter=";")

# load the results of the active policy
activeData = pd.read_csv(activeCSVInPath, delimiter=";")

## calculate mean response times
# extract all response times of the inactive policy
inactiveResponseTimes = inactiveData.loc[:, inactiveData.columns.str.startswith('response time')]

# calculate the mean response time of the inactive policy
inactiveData['meanResponseTime'] = np.mean(inactiveResponseTimes.to_numpy())

# extract all response times of the active policy
activeResponseTimes = activeData.loc[:, activeData.columns.str.startswith('response time')]

# calculate the mean response times of the active policy
activeData['meanResponseTime'] = np.mean(activeResponseTimes.to_numpy(), axis=1)

## calculate mean costs
# extract all response times of the inactive policy
inactiveCosts = inactiveData.loc[:, inactiveData.columns.str.startswith('cost:')]

# calculate the mean response time of the inactive policy
inactiveData['meanCost'] = np.mean(inactiveCosts.to_numpy())

# extract all response times of the active policy
activeCosts = activeData.loc[:, activeData.columns.str.startswith('cost:')]

# calculate the mean response times of the active policy
activeData['meanCost'] = np.mean(activeCosts.to_numpy(), axis=1)

## calculate the score metric
activeData['score'] = 1 - 0.5*(activeData['meanCost']/activeData['meanCost'][0] + activeData['meanResponseTime']/activeData['meanResponseTime'][0])

## plot performance-cost scatter
# initialize the figure
fig,axes = plt.subplots(nrows=1,ncols=1,figsize=(9.5,7))

ax1_prim = axes

x = activeData['meanResponseTime']
y = activeData['meanCost']

# ax1_prim.scatter(inactiveData['meanResponseTime'], inactiveData['meanCost'], color='black', label='Non Elastic System')
ax1_prim.scatter(x[1:], y[1:], color='blue', label="PerOpteryx Candidates")
ax1_prim.scatter(x[0], y[0], color='red', label="Initial Candidate")
ax1_prim.scatter(x[idxChosenCand], y[idxChosenCand], color='green', label="Optimal Candidate")
ax1_prim.plot(x[idxParetoFront], y[idxParetoFront], color='black', linestyle='--', label='Pareto Front')

# # add a dashed line outside of the plot area, so that a pareto front label is added
# # the actual pareto front line is manually added in PowerPoint
# ax1_prim.axhline(y=10*max(activeData.meanCost), color='black', linestyle='--', label='Pareto Front')

# set good y-axis limits
xSpacing = 0.1*(max(activeData.meanResponseTime)-min(activeData.meanResponseTime))
ySpacing = 0.1*(max(activeData.meanCost)-min(activeData.meanCost))
ax1_prim.set_xlim(min(activeData.meanResponseTime)-xSpacing, max(activeData.meanResponseTime)+xSpacing)
ax1_prim.set_ylim(min(activeData.meanCost)-ySpacing, max(activeData.meanCost)+ySpacing)

ax1_prim.set_xlabel(r'Average Response Time in s',fontsize=fntSize)
ax1_prim.set_ylabel(r'Initial Cost in Cost Units',fontsize=fntSize)


ax1_prim.grid()

ax1_prim.legend(loc='upper center', bbox_to_anchor=(0.5, -0.1), ncol=2, fontsize=fntSize-2)

# fig.tight_layout()
fig.subplots_adjust(left=0.2, right=0.8, top=0.975, bottom=0.2)
fig.savefig(figOutPath / (f"{activeCSVInPath.parent.stem}_remmea_perf_cost.eps"), dpi=fig.dpi)
plt.close(fig)

## plot bar chart comparing chosen candidate to the initial candidate
barChartColumns = barChartDoFs.copy()
barChartColumns.insert(0,'meanCost')
barChartColumns.insert(1,'meanResponseTime')

barChartXNames = barChartDoFNames.copy()
barChartXNames.insert(0,'initial cost')
barChartXNames.insert(1,'avg. response time')

dfForBarChart = activeData.copy()
dfForBarChart = dfForBarChart.loc[idxChosenCand, barChartColumns]
dfForBarChart = 100 * dfForBarChart / activeData.loc[0, barChartColumns]

# initialize the figure
fig,axes = plt.subplots(nrows=1,ncols=1,figsize=(9.5,9))

ax1_prim = axes

ax1_prim = dfForBarChart.plot.bar(label='_nolegend')
ax1_prim.axhline(y=100.0, color='black', linestyle='--', label='The Initial Candidate\'s\nNormalized Values')

ax1_prim.set_ylabel(r'Normalized Value in %',fontsize=fntSize)

ax1_prim.set_xticks(range(len(dfForBarChart)), barChartXNames)
plt.xticks(rotation=45, ha="right")

ax1_prim.grid(axis='y')

ax1_prim.legend(loc="upper left", fontsize=fntSize-2)

fig.subplots_adjust(left=0.1, right=0.9, top=0.975, bottom=0.25)
fig.savefig(figOutPath / (f"{activeCSVInPath.parent.stem}_remmea_barChart.eps"), dpi=fig.dpi)
plt.close(fig)
