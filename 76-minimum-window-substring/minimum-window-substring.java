class Solution {
    public String minWindow(String s, String t) {
        // edge case
        if (s.length() < t.length()) {
            return "";
        }
        int[] map = new int[128];
        // storing t
        for (char ch : t.toCharArray()) {
            map[ch]++;
        }
        int requiredCount = t.length();
        int i = 0, j = 0;
        int requiredWindow = Integer.MAX_VALUE, startIdx = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            // window expand or found required char
            if (map[ch] > 0) {
                requiredCount--;
            }
            // char added to currWindow 
            map[ch]--;
            // window found
            while (requiredCount == 0) {
                // start shrinking window
                int currWindow = j - i + 1;
                if (requiredWindow > currWindow) {
                    requiredWindow = currWindow;
                    startIdx = i;
                }
                // left character remove
                map[s.charAt(i)]++;
                // required character is removed
                if (map[s.charAt(i)] > 0) {
                    requiredCount++;
                }
                // window shrink
                i++;
            }
            // window increase
            j++;
        }
        return requiredWindow == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + requiredWindow);
    }
}
