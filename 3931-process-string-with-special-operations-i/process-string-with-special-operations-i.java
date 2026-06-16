class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        // in-built fn
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            } else if (ch == '#') {
                String str = sb.toString();
                sb.append(str);
            } else if (ch == '%') {
                sb.reverse();
            } else {
                sb.append(ch);
            }
        }

        // // methods fn
        // for (char ch : s.toCharArray()) {
        //     if (ch >= 'a' && ch <= 'z') {
        //         sb.append(ch);
        //     } else if (ch == '*') {
        //         remove(sb);
        //     } else if (ch == '#') {
        //         duplicate(sb);
        //     } else if (ch == '%') {
        //         reverse(sb);
        //     }
        // }

        return sb.toString();
    }

    private void remove(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
    }

    private void duplicate(StringBuilder sb) {
        for (char ch : sb.toString().toCharArray()) {
            sb.append(ch);
        }
    }

    private void reverse(StringBuilder sb) {
        int left = 0, right = sb.length() - 1;
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}