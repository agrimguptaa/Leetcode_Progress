class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
}