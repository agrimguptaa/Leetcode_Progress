class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String s = "123456789";
        for (int i = len(low); i <= len(high); i++) {
            for (int j = 0; j <= 9 - i; j++) {
                int num = Integer.parseInt(s.substring(j, j + i));
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        // HARDCORED
        // int[] nums = { 12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567,
        //         678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345,
        //         23456, 34567, 45678, 56789, 123456, 234567, 345678,
        //         456789, 1234567, 2345678, 3456789, 12345678,
        //         23456789, 123456789
        // };
        // for (int num : nums) {
        //     if (num > low && num < high) {
        //         ans.add(num);
        //     }
        // }

        return ans;
    }

    private int len(int n) {
        int len = 0;
        while (n != 0) {
            len++;
            n /= 10;
        }
        return len;
    }
}