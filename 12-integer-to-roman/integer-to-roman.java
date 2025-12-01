class Solution {
    public String intToRoman(int n) {
        StringBuilder str=new StringBuilder();
		while(n>0) {
			if(n>=1000) {
				str.append('M');
				n-=1000;
			}
			else if(n>=900) {
				str.append("CM");
				n-=900;
			}
			else if(n>=500) {
				str.append("D");
				n-=500;
			}
			else if(n>=400) {
				str.append("CD");
				n-=400;
			}
			else if(n>=100) {
				str.append("C");
				n-=100;
			}
			else if(n>=90) {
				str.append("XC");
				n-=90;
			}
			else if(n>=50) {
				str.append("L");
				n-=50;
			}
			else if(n>=40) {
				str.append("XL");
				n-=40;
			}
			else if(n>=10) {
				str.append("X");
				n-=10;
			}
			else if(n>=9) {
				str.append("IX");
				n-=9;
			}
			else if(n>=5) {
				str.append("V");
				n-=5;
			}
			else if(n>=4) {
				str.append("IV");
				n-=4;
			}
			else {
				str.append("I");
				n-=1;
			}
		}
		return str.toString();
    }
}