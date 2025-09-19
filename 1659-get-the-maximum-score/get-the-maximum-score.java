class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        return (int)(maxPathSum(nums1,nums2)%1000000007);
    }
    public static long maxPathSum(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0,result = 0;
        int n = arr1.length;
        int m = arr2.length;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j];
                j++;
            } else {
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        while (i < n) {
            sum1 += arr1[i];
            i++;
        }
        while (j < m) {
            sum2 += arr2[j];
            j++;
        }
        result += Math.max(sum1, sum2);
        return result;
    }
}