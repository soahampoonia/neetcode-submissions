class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());

        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }

        HashSet<Integer> path = new HashSet<>();
        HashSet<Integer> safe = new HashSet<>();
        

        for (int i = 0; i < numCourses; i++) {
           if (dfs(path, graph, i, safe) == false) return false;
        }

        return true;

    }

    public boolean dfs(HashSet<Integer> path, List<List<Integer>> graph, int i, HashSet<Integer> safe) {

        if (path.contains(i)) return false;
        if (safe.contains(i)) return true;

        path.add(i);

        for (int k = 0; k < graph.get(i).size(); k++) {
            if (dfs(path, graph, graph.get(i).get(k), safe) == false) {
                return false;
            }
        }

        path.remove(i);
        safe.add(i);
        return true;

    }
}
