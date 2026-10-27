class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int tar = image[sr][sc];
        if (tar == color) {
            return image;
        }
        dfs(sr, sc, image, tar, color);
        return image;
    }

    public void dfs(int sr, int sc, int image[][], int tar, int color) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }
        if (image[sr][sc] != tar) {
            return;
        }
        image[sr][sc] = color;
        dfs(sr - 1, sc, image, tar, color);
        dfs(sr + 1, sc, image, tar, color);
        dfs(sr, sc - 1, image, tar, color);
        dfs(sr, sc + 1, image, tar, color);
    }
}