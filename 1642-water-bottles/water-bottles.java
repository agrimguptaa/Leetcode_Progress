class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        while(numBottles>=numExchange){
            int remainingBottles=numBottles%numExchange;
            int leftoverBottles=numBottles/numExchange;
            ans+=numBottles-remainingBottles;
            numBottles=remainingBottles+leftoverBottles;
        }
        ans+=numBottles;
        return ans;
    }
}