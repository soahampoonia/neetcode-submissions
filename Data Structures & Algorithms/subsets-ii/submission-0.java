class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();

        HashSet<List<Integer>> set = new HashSet<>();

        dfs(list, curr, 0, nums, set);

        return list;

    }

    public void dfs(List<List<Integer>> list, List<Integer> curr, int index, int[] nums, HashSet<List<Integer>> set) {

        if (index == nums.length) {
            list.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(nums[index]);
        dfs(list, curr, index + 1, nums, set);

        while (index < nums.length - 1 && nums[index] == nums[index + 1]) {
            index++;
        }
        index++;
        curr.remove(curr.size() - 1);
        dfs(list, curr, index, nums, set);
    }

}
