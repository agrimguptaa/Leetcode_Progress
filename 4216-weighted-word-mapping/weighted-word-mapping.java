class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            long w = 0;
            for (char ch : word.toCharArray()) {
                w += weights[ch - 'a'];
            }
            char i = (char) ('z' - (w % 26));
            ans.append(i);
        }
        return ans.toString();
    }
}