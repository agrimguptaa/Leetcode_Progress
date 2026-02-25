class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int quat = n / 4;
        for (int i = 0; i < n - quat; i++) {
            if (arr[i] == arr[i + quat]) {
                return arr[i];
            }
        }
        return -1;
    }
}