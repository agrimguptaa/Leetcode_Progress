class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = prices.length - 1, j = discounts.length - 1;
        double sum = 0.0;
        while (i >= 0 && j >= 0) {
            sum += (double) prices[i--] * (100 - discounts[j--]) / 100.0;
        }
        while (i >= 0) {
            sum += prices[i--];
        }
        return sum;
    }
}