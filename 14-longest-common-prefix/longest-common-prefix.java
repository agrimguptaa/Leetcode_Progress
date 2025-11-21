class Solution {
    public String longestCommonPrefix(String[] strs) {
        return(strs[0].substring(0,prefix(strs)));
    }
    public static int prefix(String[] s) {
		int m=Integer.MAX_VALUE;
		for(int i=0;i<s.length;i++) {
			m=Math.min(m,s[i].length());
		}
		int i=0;
		for(i=0;i<m;i++) {
			char ch=s[0].charAt(i);
			for(int j=1;j<s.length;j++) {
				if(s[j].charAt(i)!=ch) {
					return i;
				}
			}
		}
		return m;
	}
}