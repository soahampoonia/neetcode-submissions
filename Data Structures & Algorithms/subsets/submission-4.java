class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        
        dfs(0, nums, new ArrayList<>(), ans);
        

        return ans;
        
    }


    public List<Integer> dfs(int index, int[] numbs, List<Integer> current, List<List<Integer>> ansa) {
        if (index == numbs.length) {
            ansa.add(new ArrayList<>(current));
            return new ArrayList<>(current);
        }
        current.add(numbs[index]);
        dfs(index + 1, numbs, current, ansa);

        current.remove(current.size() - 1);
        dfs(index + 1, numbs, current, ansa);

        return new ArrayList<>(current);
    }
 
}

