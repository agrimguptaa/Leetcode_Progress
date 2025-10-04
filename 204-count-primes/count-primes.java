class Solution {
    public int countPrimes(int n) {
        int count=0;
        int[] arr=new int[n];
        for(int i=2;i*i<n;i++){
            if(arr[i]==0){
                for(int j=2;j*i<n;j++){
                    arr[i*j]=1;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
}