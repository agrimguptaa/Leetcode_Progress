class Solution {
    public boolean checkOnesSegment(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == '0' && s.charAt(i) == '1') {
                return false;
            }
        }
        return true;

        // return !s.contains("01");

        // int count = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == '1') {
        //         if (i == 0 || s.charAt(i - 1) == '0') {
        //             count++;
        //         }
        //     }
        //     if (count > 1) {
        //         return false;
        //     }
        // }
        // return true;
    }
}