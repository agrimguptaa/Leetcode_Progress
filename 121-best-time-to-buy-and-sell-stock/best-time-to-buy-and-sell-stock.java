class Solution {
    public int maxProfit(int[] prices) {
        return profit(prices);
    }
    public static int profit(int[]arr){
        int buy=arr[0];
		int maxProfit=0;
		for(int i=1;i<arr.length;i++) {
			int profit=arr[i]-buy;
			maxProfit=Math.max(maxProfit, profit);
			buy=Math.min(buy, arr[i]);
		}
        return maxProfit;
    }
}