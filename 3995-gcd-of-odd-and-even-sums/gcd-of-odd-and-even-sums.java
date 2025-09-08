class Solution {
    public int gcdOfOddEvenSums(int n) {
        return gcd(n);
    }
    public static int gcd(int n) {
		int oddsum=0;
		int evensum=0;
		for(int i=1;i<=2*n;i++) {
			if(i%2==0) {
				evensum+=i;
			}
			else {
				oddsum+=i;
			}
		}
		return GCD(evensum,oddsum);
	}
	public static int GCD(int n1, int n2) {
		int rem=0;
		while(n2%n1!=0) {
			rem=n2%n1;
			n2=n1;
			n1=rem;
		}
		return n1;
	}
}