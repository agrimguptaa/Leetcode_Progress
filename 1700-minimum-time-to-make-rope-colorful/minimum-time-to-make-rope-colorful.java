class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans=0;
        int a=neededTime[0];
        char c=colors.charAt(0);
        for(int i=1;i<neededTime.length;i++){
            if(colors.charAt(i)==c){
                if(a>neededTime[i]){
                    ans+=neededTime[i];
                }
                else{
                    ans+=a;
                    a=neededTime[i];
                }
            }
            else{
                a=neededTime[i];
                c=colors.charAt(i);
            }
        }    
        return ans;
    }
}