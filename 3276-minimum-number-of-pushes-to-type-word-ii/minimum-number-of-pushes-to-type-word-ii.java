class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        int ans = 0;
        for (int i = 25, push = 0; i >= 0; i--) {
            if ((25 - i) % 8 == 0) {
                push++;
            }
            ans += freq[i] * push;
        }
        return ans;
    }
}