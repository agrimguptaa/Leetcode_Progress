class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void mergeSort(int[] nums, int s, int e) {
        if (s < e) {
            int m = s + (e - s) / 2;
            mergeSort(nums, s, m);
            mergeSort(nums, m + 1, e);
            merge(nums, s, m, e);
        }
    }
    public void merge(int[] nums, int s, int m, int e) {
        int len1 = m - s + 1;
        int len2 = e - m;
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        for (int i = 0; i < len1; i++) {
            arr1[i] = nums[s + i];
        }
        for (int i = 0; i < len2; i++) {
            arr2[i] = nums[m + 1 + i];
        }
        int i = 0, j = 0, k = s;
        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                nums[k] = arr1[i];
                i++;
            } else {
                nums[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < len1) {
            nums[k] = arr1[i];
            i++;
            k++;
        }
        while (j < len2) {
            nums[k] = arr2[j];
            j++;
            k++;
        }
    }
}