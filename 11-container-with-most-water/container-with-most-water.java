class Solution {
    public int maxArea(int[] height) {
        return maxwater(height);
    }
    public static int maxwater(int[] arr) {
		int i=0;
		int j=arr.length-1;
		int max=0;
		while(i<j) {
			int width=j-i;
			int height=Math.min(arr[i], arr[j]);
			int area=width*height;
			max=max<area?area:max;
			int x=arr[i]<arr[j]?i++:j--;
		}
		return max;
	}
}