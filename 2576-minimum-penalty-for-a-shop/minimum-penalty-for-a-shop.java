class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                penalty++;
            }
        }
        int minpenalty = penalty, hour = 0;
        for (int i = 0; i < customers.length(); i++) {
            char ch = customers.charAt(i);
            if (ch == 'Y') {
                penalty--;
            } else {
                penalty++;
            }
            if (penalty < minpenalty) {
                hour = i + 1;
                penalty = minpenalty;
            }
        }
        return hour;
    }
}