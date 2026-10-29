class Solution {
    List<List<Integer>> subs = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return subs;
    }

    void dfs(int[] nums, int i, List<Integer> list) {
        subs.add(new ArrayList(list));
        if (i == nums.length) return;

        for (int start = i; start < nums.length; start++) {
            list.add(nums[start]);
            dfs(nums, start + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
