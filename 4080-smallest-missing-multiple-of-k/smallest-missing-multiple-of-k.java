class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ans){
                ans+=k;
            }
        } 
        return ans;
    }
}