class Solution {
    public String addStrings(String a, String b) {
        StringBuilder ans=new StringBuilder();
        int i=a.length()-1,j=b.length()-1, carry=0;
        while (i>=0 || j>=0 || carry!=0) {
            int sum=carry;
            sum+=(j>=0)?b.charAt(j--)-'0':0;
            sum+=(i>=0)?a.charAt(i--)-'0':0;
            ans.append(sum%10);
            carry=sum/10;
        }
        return ans.reverse().toString();
    }
}