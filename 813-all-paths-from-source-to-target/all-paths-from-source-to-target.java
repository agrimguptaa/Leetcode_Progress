class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        dfs(0, graph, ans, ll);
        return ans;
    }

    void dfs(int curr, int[][] graph, List<List<Integer>> ans, List<Integer> ll) {
        ll.add(curr);
        if (curr == graph.length - 1) {
            ans.add(new ArrayList<>(ll));
        }
        for (int next : graph[curr]) {
            dfs(next, graph, ans, ll);
        }
        ll.remove(ll.size() - 1);
    }
}