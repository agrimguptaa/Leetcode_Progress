class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, ans = 0;
        for (int right = 0; right < fruits.length; right++) {
            // add fruit
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            // if more than 2 types, shrink window
            while (map.size() > 2) {
                int f = fruits[left];
                map.put(f, map.get(f) - 1);
                if (map.get(f) == 0) {
                    map.remove(f);
                }
                left++;
            }
            // current valid window
            ans = Math.max(ans, (right - left + 1));
        }
        return ans;
    }
}