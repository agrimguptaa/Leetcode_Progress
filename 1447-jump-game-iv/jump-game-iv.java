class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        Map<Integer, Stack<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], new Stack<>());
            }
            map.get(arr[i]).push(i);
        }
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        q.add(0);
        int steps = 0;
        int size = 1;
        while (!q.isEmpty()) {
            if (size == 0) {
                size = q.size();
                steps++;
            }
            int curr = q.poll();
            size--;
            if (set.contains(curr)) {
                continue;
            }
            set.add(curr);
            if (curr == n - 1) {
                return steps;
            }
            if (curr + 1 < n) {
                q.add(curr + 1);
            }
            if (curr - 1 >= 0) {
                q.add(curr - 1);
            }
            while (!map.get(arr[curr]).isEmpty()) {
                q.add(map.get(arr[curr]).pop());
            }
        }
        return -1;
    }
}