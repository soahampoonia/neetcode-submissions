class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();

        int sum = 0;

        dfs(list, curr, candidates, target, 0, sum);

        return list;

    }


    public void dfs(List<List<Integer>> list, List<Integer> curr, int[] candidates, int target, int index, int sum) {
        if (sum > target) return;
        
        if (sum == target) {
            list.add(new ArrayList<>(curr));
            return;
        }
        if (index == candidates.length) return;

        curr.add(candidates[index]);
        dfs(list, curr, candidates, target, index + 1, sum + candidates[index]);

        while (index < candidates.length - 1 && candidates[index] == candidates[index + 1]) {
            index++;
        }
        curr.remove(curr.size() - 1);
        dfs(list, curr, candidates, target, index + 1, sum);

    }
}
