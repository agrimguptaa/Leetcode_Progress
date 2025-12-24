class Solution {
    public int minimumBoxes(int[] apples, int[] capacity) {
        int sum = 0;
        for (int apple : apples) {
            sum += apple;
        }
        Arrays.sort(capacity);
        int right = capacity.length - 1;
        int boxes = 0;
        while (right >= 0) {
            sum -= capacity[right];
            boxes++;
            if (sum <= 0) {
                break;
            }
            right--;
        }
        return boxes;
    }
}