class Solution {
    public int[] sortedSquares(int[] nums) {
        return Square(nums);
    }
    public static int[] Square(int[] arr) {
        int n=arr.length;
		int[] narr=new int[n];
		int j=0;
		int k=n-1;
		for(int i=n-1;i>=0;i--) {
			if(Math.abs(arr[j])>Math.abs(arr[k])) {
				narr[i]=arr[j]*arr[j];
				j++;
			}
			else {
				narr[i]=arr[k]*arr[k];
				k--;
			}
		}
		return narr;
	}
}