class Solution {
    public void rotate(int[] nums, int k) {
        potate(nums,k);
    }
    public static void potate(int[]arr,int k) {
		int n=arr.length;
		k=k%n;
//		starting ke n-k element reverse
		rev(arr,0,n-k-1);
//		last ke k element reverse
		rev(arr,n-k,n-1);
//		all element reverse
		rev(arr,0,n-1);
	}
	public static void rev(int[]arr,int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}