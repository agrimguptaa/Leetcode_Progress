class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int e=nums[0];
        int i=0;
        while(i<nums.length){
            if(e==nums[i]){
                i++;
            }else{
                ans.add(e);
            }
            e++;
        }
        return ans;
    }
}