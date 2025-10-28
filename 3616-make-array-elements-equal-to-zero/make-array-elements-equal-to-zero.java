class Solution {
    public int countValidSelections(int[] nums) {
        int total=0;
        int rs=0;
        int cases=0;
        for (int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            int ls=total-rs-nums[i];
            if (nums[i]==0){
                if(ls==rs){
                    cases+=2;
                }else if(ls==rs-1 || ls-1==rs){
                    cases+=1;
                }
            }
            rs+=nums[i];
        }
        return cases;
    }
}