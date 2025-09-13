class Solution {
    public int missingNumber(int[] nums) {
        return missing(nums);
    }
    public static int missing(int[]arr) {
		int n=arr.length;
		int tsum=n*(n+1)/2;
		int arrsum=0;
		for(int i=0;i<n;i++) {
			arrsum+=arr[i];
		}
		return tsum-arrsum;
	}
}