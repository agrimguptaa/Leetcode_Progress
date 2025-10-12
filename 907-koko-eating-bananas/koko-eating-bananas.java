class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hg=Arrays.stream(piles).max().getAsInt();
        int ans=hg;
        while(lo<=hg){
            int mid=lo+(hg-lo)/2;
            if(isval(piles,mid,h)){
                ans=mid;
                hg=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isval(int[] arr,int speed,int target){
        int c=0;
        for(int item:arr){
            c+=item/speed;
            if(item%speed!=0){
                c+=1;
            }
            if(c>target){
                return false;
            }
        }
        return true;
    }
    // public int max(int[]piles){
    //     int max=0;
    //     for(int pile:piles){
    //         if(pile>max){
    //             max=pile;
    //         }
    //     }
    //     return max;
    // }
}