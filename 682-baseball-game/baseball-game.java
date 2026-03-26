class Solution {
    public int calPoints(String[] operations) {
        List<Integer> arr = new ArrayList<>();
        for (String operation : operations) {
            int n = arr.size();
            if (operation.equals("+")) {
                arr.add(arr.get(n - 1) + arr.get(n - 2));
            } else if (operation.equals("D")) {
                arr.add(arr.get(n - 1) * 2);
            } else if (operation.equals("C")) {
                arr.remove(n - 1);
            } else {
                arr.add(Integer.parseInt(operation));
            }
        }
        int sum = 0;
        for (int sc : arr) {
            sum += sc;
        }
        return sum;
    }
}