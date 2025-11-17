class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int dist=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(dist==-1){
                    dist=i;
                }else if(Math.abs(i-dist-1)<k){
                    return false;
                }
                dist=i;
            }
        }
        return true;
    }
}