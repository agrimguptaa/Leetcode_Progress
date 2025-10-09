class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        rotateclockwise(matrix);
    }
    public static void transpose(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void rotateclockwise(int[][]arr){
        for(int row=0;row<arr.length;row++){
            int top=0;
            int bottom=arr.length-1;
            while(top<bottom){
                int temp=arr[row][top];
                arr[row][top]=arr[row][bottom];
                arr[row][bottom]=temp;
                top++;
                bottom--;
            }
        }
    }
}