class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int lsum = 0, rsum = 0;
        int rQues = 0, lQues = 0;
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                lQues++;
            } else {
                lsum += num.charAt(i) - '0';
            }
        }
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rQues++;
            } else {
                rsum += num.charAt(i) - '0';
            }
        }
        if (lQues - rQues == 0) {
            if (lsum - rsum == 0) {
                return false;
            }
            return true;
        }
        if (lsum == rsum && lQues != rQues) {
            return true;
        }
        if ((lsum > rsum && lQues > rQues) || (lsum < rsum && lQues < rQues)) {
            return true;
        }
        int ques = Math.abs(lQues - rQues);
        int sum = Math.abs(lsum - rsum);
        if (ques % 2 != 0) {
            return true;
        }
        return !((ques / 2) * 9 == sum);
    }
}