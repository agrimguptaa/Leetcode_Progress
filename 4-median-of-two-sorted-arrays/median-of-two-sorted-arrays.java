class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
		int[]ans=new int[nums1.length+nums2.length];
		int i=0;
		int j=0;
		int n=0;
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j]) {
				ans[n++]=nums1[i++];
			}else {
				ans[n++]=nums2[j++];
			}
		}
		while(i<nums1.length){
            ans[n++]=nums1[i++];
        }
        while(j<nums2.length){
            ans[n++]=nums2[j++];
        }
        if(ans.length%2!=0) {
        	return ans[ans.length/2];
        } 
        return (double)(ans[ans.length/2]+ans[ans.length/2-1])/2;
    }
}