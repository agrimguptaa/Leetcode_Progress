class Solution {
    public boolean isPerfectSquare(int num) {
        long lo=0,hg=num;
        while(lo<=hg){
            long ans=lo+(hg-lo)/2;
            if(ans*ans==num){
                return true;
            }else if(ans*ans>num){
                hg=ans-1;
            }else{
                lo=ans+1;
            }
        }
        return false;
    }
}