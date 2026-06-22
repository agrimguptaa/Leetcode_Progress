class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }
        int ans = Math.min(freq['b' - 'a'], freq['a' - 'a']);
        ans = Math.min(ans, freq['l' - 'a'] / 2);
        ans = Math.min(ans, freq['o' - 'a'] / 2);
        ans = Math.min(ans, freq['n' - 'a']);
        return ans;

        // return Math.min(
        //             Math.min(
        //                 Math.min(freq['b' - 'a'], freq['a' - 'a']),
        //                 Math.min(freq['l' - 'a'] / 2, freq['o' - 'a'] / 2)
        //             ), 
        //             freq['n' - 'a']
        //         );
    }
}