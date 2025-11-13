class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans=new LinkedList<>();
        int n=arr.length;
        for(int i=n;i>1;i--){
            int idx=largest(arr,i);
            flip(arr,idx);
            ans.add(idx+1);
            flip(arr,i-1);
            ans.add(i);
        }
        return ans;
    }
    public void flip(int[]arr,int n){
        int i=0,j=n;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public int largest(int[]arr,int n){
        int idx=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[idx]){
                idx=i;
            }
        }
        return idx;
    }
}