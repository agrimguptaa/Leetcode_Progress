class Solution {
public:
    int climbStairs(int n) {
        int a=0;
        int b=1;
        int i=1;
        int temp=0;
			while(i<=n) {
				temp=a+b;
                a=b;
                b=temp;
                i++;
			}
        return temp;
    }
};