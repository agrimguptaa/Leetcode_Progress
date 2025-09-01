class Solution {
    public int minStartValue(int[] nums) {
        return min(nums);
    }
    public static int min(int[]arr) {
		int n=arr.length;
		int sum=0;
        int max=1;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
            if(sum+max<1){
                max=Math.abs(sum)+1;
            }
		}
		return max;
	}
}