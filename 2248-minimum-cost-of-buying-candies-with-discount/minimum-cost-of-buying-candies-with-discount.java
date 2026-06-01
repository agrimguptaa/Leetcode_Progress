class Solution {
    public int minimumCost(int[] costs) {
        int[] freq = new int[101];
        for (int i : costs) {
            freq[i]++;
        }
        int paid = 0;
        int total = 0;
        for (int i = 100; i > 0; i--) {
            if (freq[i] > 2 - paid) {
                freq[i] -= (3 - paid);
                total += (2 - paid) * i;
                total += 2 * i * (freq[i] / 3);
                paid = freq[i] % 3;
                total += i * paid;
            } else {
                paid += freq[i];
                total += i * freq[i];
            }
        }
        return total;
    }
}