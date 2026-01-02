class Solution {
    public boolean rotateString(String s, String goal) {
        int l = s.length();
        for (int i = 1; i <= l; i++) {
            StringBuilder str = new StringBuilder();
            str.append(s.substring(i, l));
            str.append(s.substring(0, i));
            if (str.toString().equals(goal)) {
                return true;
            }
        }
        return false;

        // optimal
        // if (s.length() != goal.length()) {
        //     return false;
        // }
        // return (s + s).contains(goal); 
    }
}