class Solution {
    public int matrixSum(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        for (int i=0;i<n;i++) {
            Arrays.sort(nums[i]);
        }
        int score=0;
        for (int col=0;col<m;col++) {
            int max=0;
            for (int row=0;row<n;row++) {
                max=Math.max(max,nums[row][col]);
            }
            score+=max;
        }
        return score;
    }
}