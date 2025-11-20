class Solution {
    public int numSub(String s) {
        long ans=0;
        int count=0;
        long mod=1000000007;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }else{
                ans=(ans+(long)count*(count+1)/2)%mod;
                count=0;
            }
        }
            ans=(ans+(long)count*(count+1)/2)%mod;
            return (int)ans;
    }
}