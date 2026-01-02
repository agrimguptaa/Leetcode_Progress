class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        int[] freq = new int[10001]; 
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
            if (freq[nums[i]] == n) {
                return nums[i];
            }
        }
        return -1;


        // optimal in space
        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     if (set.contains(num)) {
        //         return num;
        //     }
        //     set.add(num);
        // }
        // return -1;
    }
}