class Solution {
    public int firstMissingPositive(int[] nums) {
        // putting number on correct index as (nums[i]==i+1)
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int crrIdx = nums[i] - 1;
                int temp = nums[crrIdx];
                nums[crrIdx] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;

        //mark if positive numbers from 1 to n exist
        // boolean[] mark = new boolean[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > 0 && nums[i] <= nums.length) {
        //         mark[nums[i] - 1] = true;
        //     }
        // }
        // for (int i = 0; i < mark.length; i++) {
        //     if (mark[i] == false) {
        //         return i + 1;
        //     }
        // }
        // return nums.length + 1;

        // turning the value at their corresponding index negative
        // int isOne=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==1){
        //         isOne=1;
        //     }
        //     if(nums[i]<=0 || nums[i]>nums.length){
        //         nums[i]=1;
        //     }
        // }
        // if(isOne!=1){
        //     return 1;
        // }
        // for(int i=0;i<nums.length;i++){
        //     int idx=Math.abs(nums[i]);
        //     idx-=1;
        //     if(nums[idx]>0){
        //         nums[idx]*=-1;
        //     }
        // }
        // for(int i=0;i<nums.length;i++){ 
        //     if(nums[i]>0){ 
        //         return i+1; 
        //     } 
        // }
        // return nums.length+1;
    }
}