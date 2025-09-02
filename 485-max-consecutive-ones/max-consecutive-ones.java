class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return con(nums);
    }
    public static int con(int[]arr) {
		int count=0;
		int maxcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
			else {
				count=0;
			}
			maxcount=Math.max(count, maxcount);
		}
		return maxcount;
	}
}