class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();

        dfs(list, curr, n, k, 1);

        return list;
    }


    public void dfs(List<List<Integer>> list, List<Integer> curr, int n, int k, int index) {
        if (curr.size() == k) {
            list.add(new ArrayList<>(curr));
            return;
        }

        
        if (index <= n) {
            curr.add(index);
            dfs(list, curr, n, k, index + 1);
        } else return;

        curr.remove(curr.size() - 1);
        dfs(list, curr, n, k, index + 1);
        
    }
}