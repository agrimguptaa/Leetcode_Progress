class Solution {
    public int totalMoney(int n) {
        long weeks=n/7;
        long remdays=n%7;
        long tweeks=7L*weeks*(weeks+7)/2; 
        long rem=1L*remdays*(weeks+1)+1L*remdays*(remdays-1)/2;
        return (int)(tweeks+rem);
    }
}