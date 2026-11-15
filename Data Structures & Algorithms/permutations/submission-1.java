class Solution {
    
    

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();

        HashSet<Integer> used = new HashSet<>();

        dfs(list, curr, 0, nums, used);

        return list;
    }

    public void dfs(List<List<Integer>> list, List<Integer> curr, int index, int[] nums, HashSet<Integer> used) {
        if (index < 0) return;

        if (curr.size() == nums.length) {
            list.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used.contains(nums[i])) {
                continue;
            }
            
            used.add(nums[i]);
            curr.add(nums[i]);
            dfs(list, curr, index, nums, used);

            if (curr.size() > 0) {
                used.remove(curr.get(curr.size() - 1));
                curr.remove(curr.size() - 1);
            }

        }

       
    }
}
