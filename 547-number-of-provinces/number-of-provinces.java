class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, ans = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                ans++;
            }
        }
        return ans;
    }

    private void dfs(int i, int[][] isConnected, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                dfs(j, isConnected, visited);
            }
        }
    }

    // //<-----------------------Disjoint Set Union----------------------->
    // int[] parent;
    // int[] rank;

    // public int findCircleNum(int[][] isConnected) {
    //     int n = isConnected.length;
    //     parent = new int[n];
    //     rank = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         parent[i] = i;
    //     }
    //     int ans = n;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (isConnected[i][j] == 1) {
    //                 if (union(i, j)) {
    //                     ans--;
    //                 }
    //             }
    //         }
    //     }
    //     return ans;
    // }

    // private int find(int x) {
    //     if (parent[x] != x) {
    //         parent[x] = find(parent[x]);
    //     }
    //     return parent[x];
    // }

    // private boolean union(int x, int y) {
    //     int rootX = find(x);
    //     int rootY = find(y);
    //     if (rootX == rootY) {
    //         return false;
    //     }
    //     if (rank[rootX] < rank[rootY]) {
    //         parent[rootX] = rootY;
    //     } else if (rank[rootX] > rank[rootY]) {
    //         parent[rootY] = rootX;
    //     } else {
    //         parent[rootY] = rootX;
    //         rank[rootX]++;
    //     }
    //     return true;
    // }
}