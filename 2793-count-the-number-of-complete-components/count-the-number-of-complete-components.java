class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i = 0; i < edges.length; i++) {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            Queue<Integer> q = new ArrayDeque<>();
            q.add(i);
            int nodes = 0;
            int sum = 0;
            while (!q.isEmpty()) {
                int r = q.poll();
                if (visited[r]) {
                    continue;
                }
                visited[r] = true;
                nodes++;
                sum += graph.get(r).size();
                for (int nbr : graph.get(r)) {
                    if (!visited[nbr]) {
                        q.offer(nbr);
                    }
                }
            }
            if (sum / 2 == nodes * (nodes - 1) / 2) {
                ans++;
            }
        }
        return ans;
    }
}