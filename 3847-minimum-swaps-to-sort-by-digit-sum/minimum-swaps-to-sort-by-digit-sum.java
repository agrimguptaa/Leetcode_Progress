class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            data[i][0] = nums[i];
            data[i][1] = sum;
        }
        Arrays.sort(data, (a, b) -> {
            return a[1] != b[1] ? a[1] - b[1] : a[0] - b[0];
        });
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        int flags = 0;
        for (int i = 0; i < n; i++) {
            int corrVal = data[i][0];
            if (nums[i] != corrVal) {
                int corrIdx = map.get(corrVal);
                int temp = nums[i];
                nums[i] = nums[corrIdx];
                nums[corrIdx] = temp;
                map.put(nums[i], i);
                map.put(nums[corrIdx], corrIdx);
                flags++;
            }
        }
        return flags;
    }
}