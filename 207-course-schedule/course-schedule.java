class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : prerequisites) {
            int u = e[1];
            int v = e[0];
            adj.get(u).add(v);
        }
        int[] state = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0) {
                if (dfs(i, adj, state)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] state) {
        if (state[node] == 1) {
            return true;
        }
        if (state[node] == 2) {
            return false;
        }
        state[node] = 1;
        for (int next : adj.get(node)) {
            if (dfs(next, adj, state)) {
                return true;
            }
        }
        state[node] = 2;
        return false;
    }
}
