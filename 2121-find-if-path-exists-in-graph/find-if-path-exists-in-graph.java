class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] seen = new boolean[n];
        return dfs(source, destination, adj, seen);
    }

    private boolean dfs(int curr, int destination, List<List<Integer>> adj, boolean[] seen) {
        if (curr == destination) {
            return true;
        }
        seen[curr] = true;
        for (int neighbor : adj.get(curr)) {
            if (!seen[neighbor]) {
                if (dfs(neighbor, destination, adj, seen)) {
                    return true;
                }
            }
        }
        return false;
    }
}