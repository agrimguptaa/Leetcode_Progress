class Solution {
    public int minimumDeletions(String s) {
        int aCnt = 0, bCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                bCnt++;
            } else {
                aCnt = Math.min(aCnt + 1, bCnt);
            }
        }
        return aCnt;
    }
}