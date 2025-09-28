class Solution {
    public int removeDuplicates(int[] nums) {
        return remove(nums);
    }
    public int remove(int[] arr) {
        int n=arr.length;
        if(n<=2){
            return n;
        }
        int j=2;
        for(int i=2; i<n; i++){
            if(arr[i]!=arr[j-2]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
}