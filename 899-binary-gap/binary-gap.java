class Solution {
    public int binaryGap(int n) {
        int maxDist = 0;
        int currDist = 0;
        boolean in = false;
        while (n != 0) {
            int rem = n % 2;
            if (rem == 1) {
                if (in) {
                    maxDist = maxDist < currDist ? currDist : maxDist;
                }
                in = true;
                currDist = 1;
            } else if (in) {
                currDist++;
            }
            n /= 2;
        }
        return maxDist;
    }
}