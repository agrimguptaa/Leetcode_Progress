class Solution {
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;i<=Integer.MAX_VALUE;i++){
            if(istrue(i)){
                return i;
            }
        }
        return 0;
    }
    public boolean istrue(int n){
        int[]fcount=new int[10];
        while(n>0){
            int rem=n%10;
            fcount[rem]++;
            n/=10;
        }
        for(int i=0;i<10;i++){
            if(fcount[i]!=0 && fcount[i]!=i){
                return false;
            }
        }
        return true;
    }
}