class Solution {
    public List<String> validateCoupons(String[] a, String[] b, boolean[] c) {
        List<String> result = new ArrayList<>();
        List<String> electronics = new ArrayList<>();
        List<String> grocery = new ArrayList<>();
        List<String> pharmacy = new ArrayList<>();
        List<String> restaurant = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (helper1(a[i]) == false || c[i]==false) {
                continue;
            }
            if (b[i].equals("electronics")) {
                electronics.add(a[i]);
            } else if (b[i].equals("grocery")) {
                grocery.add(a[i]);
            } else if (b[i].equals("pharmacy")) {
                pharmacy.add(a[i]);
            } else if (b[i].equals("restaurant")) {
                restaurant.add(a[i]);
            }
        }
        Collections.sort(electronics);
        Collections.sort(grocery);
        Collections.sort(pharmacy);
        Collections.sort(restaurant);
        result.addAll(electronics);
        result.addAll(grocery);
        result.addAll(pharmacy);
        result.addAll(restaurant);
        return result;
    }

    public boolean helper1(String s) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch) || ch == '_') {
                continue;
            }
            return false;
        }
        return true;
    }
}