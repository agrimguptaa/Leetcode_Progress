class Solution {
    public String concatHex36(int n) {
        return convert(n * n, 16) + convert(n * n * n, 36);
    }
    public String convert(int num, int base) {
        if (num == 0) {
            return "0";
        }
        char[] s = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(s[num % base]);
            num = num / base;
        }
        return sb.reverse().toString();
    }
}