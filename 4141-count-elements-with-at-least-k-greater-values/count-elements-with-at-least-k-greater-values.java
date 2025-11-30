class Solution {
    public int countElements(int[] nums, int k) {
        if(k==0){
            return nums.length;
        }
        Arrays.sort(nums);
        int ele=nums[nums.length-k];
        int count=0;
        for(int num:nums){
            if(ele>num){
                count++;
            }
        }
        return count;
    }
}