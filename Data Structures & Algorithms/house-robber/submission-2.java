class Solution {
    public int rob(int[] nums) {
        int[] moneys = new int[nums.length + 1];
        moneys[1] = nums[0];

        for (int i = 2; i < moneys.length; i++) {
            moneys[i] = Math.max(moneys[i - 2] + nums[i - 1], moneys[i - 1]);
        }

        return moneys[moneys.length - 1];
    }
}
