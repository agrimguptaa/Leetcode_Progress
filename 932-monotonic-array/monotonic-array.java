class Solution {
    public boolean isMonotonic(int[] nums) {
        return monotonic(nums);
    }
    public static boolean monotonic(int[]arr) {
		int incount=0;
        int dccount=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				incount++;
			}
			if(arr[i]<arr[i+1]) {
				dccount++;
			}
		}
		if (incount > 0 && dccount > 0) {
			return false;
		}
		else {
			return true;
		}
	}
}