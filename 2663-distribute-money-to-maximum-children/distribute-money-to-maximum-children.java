class Solution {
    public int distMoney(int money, int children) {
        //insaani dimaag
        if (money < children) {
            return -1;
        }
        if (money == children) {
            return 0;
        }
        money -= children;
        int ans = money / 7;
        if ((ans == children - 1 && money % 7 == 3) || (ans == children && money % 7 != 0)) {
            ans--;
        }
        if (ans > children) {
            return children - 1;
        }
        return ans;


        //AI ko rula ke uska lagaya hu dimaag
        // if (money < children) {
        //     return -1;
        // }
        // if (money == children) {
        //     return 0;
        // }
        // money -= children;
        // int ans = Math.min(money / 7, children);
        // if (children - ans == 1 && money - ans * 7 == 3) {
        //     ans--;
        // }
        // if (ans == children && money - ans * 7 >= 8) {
        //     ans--;
        // }
        // return ans;
    }
}