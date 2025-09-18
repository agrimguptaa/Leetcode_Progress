class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return maxcirsum(nums);
    }
    public static int maxcirsum(int[]arr) {
		int linear_Maximum_Sum=kadanes_Algorithm(arr);
		int tsum=0;
		for (int i = 0; i < arr.length; i++) {
			tsum+=arr[i];
			arr[i]*=-1;
		}
		int cir_sum=tsum+kadanes_Algorithm(arr);
		if(cir_sum==0) {
			return linear_Maximum_Sum;
		}
		return Math.max(linear_Maximum_Sum, cir_sum);
	}
	public static int kadanes_Algorithm(int[]arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}
}