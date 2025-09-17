class Solution {
    public void nextPermutation(int[] nums) {
        premutation(nums);
    }
    public static void premutation(int[]rr) {
		//step1 find p
		int p=-1;
		for (int i = rr.length-2; i>=0; i--) {
			if(rr[i]<rr[i+1]) {
				p=i;
				break;
			}
		}
		if(p==-1) {
			reverse(rr,0,rr.length-1);
			return;
		}
		//step2 find 2
		int q=-1;
		for (int i = rr.length-1; i>p; i--) {
			if(rr[i]>rr[p]) {
				q=i;
				break;
			}
		}
		//step3 swap p and q index value
		int temp=rr[p];
		rr[p]=rr[q];
		rr[q]=temp;
		//step4 reverse p+1 to n-1 index
		reverse(rr,p+1,rr.length-1);
	}
	public static void reverse(int[]arr,int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}