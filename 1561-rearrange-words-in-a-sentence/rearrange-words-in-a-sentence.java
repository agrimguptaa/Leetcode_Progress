class Solution {
    public String arrangeWords(String text) {
        String[] s = text.split(" ");
        s[0] = Character.toLowerCase(s[0].charAt(0)) + s[0].substring(1);
        Arrays.sort(s, (a, b) -> Integer.compare(a.length(), b.length()));
        s[0] = Character.toUpperCase(s[0].charAt(0)) + s[0].substring(1);
        return String.join(" ", s);
    }
}