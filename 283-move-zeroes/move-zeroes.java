class Solution {
    public void moveZeroes(int[] nums) {
        move(nums);
    }
    public static int[] move(int[]arr) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[c]=arr[i];
				if(i!=c){
                    arr[i]=0;
                }
				c++;
			}
		}
		return arr;
	}
}