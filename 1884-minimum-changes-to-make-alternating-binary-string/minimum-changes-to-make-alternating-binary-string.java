class Solution {
    public int minOperations(String s) {
        int mm = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != (i % 2 == 0 ? '1' : '0')) {
                mm++;
            }
        }
        return Math.min(mm, s.length() - mm);

        // int op0 = 0, op1 = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     char d0 = (i % 2 == 0) ? '0' : '1';
        //     char d1 = (i % 2 == 0) ? '1' : '0';
        //     if (s.charAt(i) != d0) {
        //         op0++;
        //     }
        //     if (s.charAt(i) != d1) {
        //         op1++;
        //     }
        // }
        // return Math.min(op0, op1);
    }
}