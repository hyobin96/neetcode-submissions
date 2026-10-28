class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] totalPays = new int[cost.length + 1];

        for (int i = 2; i < totalPays.length; i++) {
            totalPays[i] = Math.min(totalPays[i - 1] + cost[i - 1], totalPays[i - 2] + cost[i - 2]);
        }

        return totalPays[totalPays.length - 1];
    }
}
