class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted);
        HashMap<Integer, Integer> map = new HashMap<>();
        int pos = 1;
        for (int i : sorted) {
            if (!map.containsKey(i)) {
                map.put(i, pos++);
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}