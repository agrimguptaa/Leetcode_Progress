class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        Set<Integer> fc = new HashSet<>();
        for (int i : freq.values()) {
            if (!fc.add(i)) {
                return false;
            }
        }
        return true;
    }
}