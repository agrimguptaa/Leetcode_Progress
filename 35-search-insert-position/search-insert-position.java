class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums,target);
    }
    public static int search(int[]num,int val) {
		int n=num.length;
		for(int i=0;i<n;i++) {
			if (num[i]>=val) {
                return i;
            }
        }
        return n;	
	}
}