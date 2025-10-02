class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles=numBottles;
        while(emptyBottles>=numExchange){
            emptyBottles-=numExchange;
            emptyBottles++;
            numExchange++;
            numBottles++;
        }
        return numBottles;
    }
}