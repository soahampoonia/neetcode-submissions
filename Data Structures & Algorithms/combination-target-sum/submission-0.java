class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> list = new ArrayList<>();
        int sum = 0;
        List<Integer> curr = new ArrayList<>();
        int index = 0;

        dfs(list, nums, sum, target, curr, index);

        return list;
    }

    public void dfs(List<List<Integer>> list, int[] nums, int sum, int target, List<Integer> curr, int index) {

        if (sum == target) {
            list.add(new ArrayList<>(curr));
            return;
        }

        if (sum > target || index == nums.length) {
            return;
        }

        curr.add(nums[index]);
        dfs(list, nums, sum + nums[index], target, curr, index);
        curr.remove(curr.size() - 1);

        dfs(list, nums, sum, target, curr, index + 1);

    }
}
