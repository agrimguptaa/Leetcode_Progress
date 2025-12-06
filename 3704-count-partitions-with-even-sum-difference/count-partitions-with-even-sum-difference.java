class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int c=0;
        int k=0;
        for(int i=0;i<nums.length-1;i++){
            c+=nums[i];
            sum-=nums[i];
            if(Math.abs(c-sum)%2==0){
                k++;
            }
        }
        return k;
    }
}