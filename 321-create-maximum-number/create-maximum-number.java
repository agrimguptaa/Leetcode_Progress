class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] ans = new int[k];
        int i = Math.max(0, k - nums2.length);
        int j = Math.min(k, nums1.length);
        while (i <= j) {
            int[] p1 = maxSeq(nums1, i);
            int[] p2 = maxSeq(nums2, k - i);
            int[] merged = merge(p1, p2);
            if (isBig(merged, 0, ans, 0)) {
                ans = merged;
            }
            i++;
        }
        return ans;
    }

    private int[] maxSeq(int[] nums, int k) {
        int n = nums.length - k, t = 0;
        int[] st = new int[k];
        for (int num : nums) {
            while (t > 0 && n > 0 && st[t - 1] < num) {
                t--;
                n--;
            }
            if (t < k) {
                st[t++] = num;
            } else {
                n--;
            }
        }
        return st;
    }

    private int[] merge(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length || j < b.length) {
            if (isBig(a, i, b, j)) {
                ans[k++] = a[i++];
            } else {
                ans[k++] = b[j++];
            }
        }
        return ans;
    }

    private boolean isBig(int[] a, int i, int[] b, int j) {
        while (i < a.length && j < b.length && a[i] == b[j]) {
            i++;
            j++;
        }
        if (j == b.length) {
            return true;
        }
        if (i < a.length && a[i] > b[j]) {
            return true;
        }
        return false;
    }
}