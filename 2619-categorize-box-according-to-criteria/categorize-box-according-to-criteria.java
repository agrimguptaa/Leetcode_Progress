class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean heavy = false, bulky = false;
        double volume = (double) length * width * height;
        if (mass >= 100) {
            heavy = true;
        }
        if (length >= 10000 || width >= 10000 || height >= 10000 ||
                volume >= 1000000000) {
            bulky = true;
        }

        if (bulky && heavy) {
            return "Both";
        } else if (!bulky && !heavy) {
            return "Neither";
        } else if (!bulky && heavy) {
            return "Heavy";
        } else {
            return "Bulky";
        }
    }
}