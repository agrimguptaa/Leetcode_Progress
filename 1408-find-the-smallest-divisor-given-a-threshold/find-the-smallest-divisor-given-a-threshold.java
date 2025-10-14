class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo=1;
        int hi=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isval(nums,mid,threshold)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isval(int[] arr,int div,int target){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]/div;
            if(arr[i]%div!=0){
                sum++;
            }
            if(sum>target){
                return false;
            }
        }
        return true; 
    }
}