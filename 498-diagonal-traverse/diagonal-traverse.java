class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int idx = 0;
        int[] ans = new int[row * col];
        for (int d = 0; d < row + col + 1; d++) {
            int r, c;
            if (d < col) {
                r = 0;
                c = d;
            } else {
                r = d - col + 1;
                c = col - 1;
            }
            ArrayList<Integer> ll = new ArrayList<>();
            while (r < mat.length && c >= 0) {
                ll.add(mat[r][c]);
                r++;
                c--;
            }
            if (d % 2 != 0) {
                for (int ele : ll) {
                    ans[idx] = ele;
                    idx++;
                }
            } else {
                Collections.reverse(ll);
                for (int ele : ll) {
                    ans[idx] = ele;
                    idx++;
                }
            }
        }
        return ans;
    }
}