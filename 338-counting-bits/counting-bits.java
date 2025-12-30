class Solution {
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        // bruteForce
		for (int i = 0; i <= n; i++) {
			int nums=i;
			int count=0;
			while(nums>0) {
				int rem=nums%2;
				if(rem==1) {
					count++;
				}
				nums/=2;
			}
			ans[i]=count;
		}

        // optimal
        // for (int i = 1; i <= n; i++) {
        //     ans[i] = ans[i >> 1] + (i & 1);
        // }

		return ans;
    }
}