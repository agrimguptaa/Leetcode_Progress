class Solution {
    public int removeDuplicates(int[] nums) {
        return remove(nums);
    }
    public static int remove(int[]arr) {
		int p=1;
		if(arr.length==0) return 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				arr[p]=arr[i];
				p++;
			}
		}
		return p;
	}
}