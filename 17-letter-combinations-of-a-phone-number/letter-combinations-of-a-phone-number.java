class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ll = new ArrayList<>();
        KeyPad(digits, "", ll);
        return ll;
    }

    public static void KeyPad(String ques, String ans, ArrayList<String> ll) {
        String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        if (ques.length() == 0) {
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String get = key[ch - '0'];
        for (int i = 0; i < get.length(); i++) {
            KeyPad(ques.substring(1), ans + get.charAt(i), ll);
        }
    }
}