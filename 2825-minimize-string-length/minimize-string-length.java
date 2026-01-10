class Solution {
    public int minimizedStringLength(String s) {
        // FREQUENCY ARRAY
        // int[] arr = new int[26];
        // for (char a : s.toCharArray()) {
        //     arr[a - 'a']++;
        // }
        // int count = 0;
        // for (int i : arr) {
        //     if (i > 0) {
        //         count++;
        //     }
        // }
        // return count;

        // HASHSET
        Set<Character> container = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            if (!container.contains(s.charAt(i))){
                container.add(s.charAt(i));
            }
        }
        return container.size();

        // ONE LINER
        // return (int) s.chars().distinct().count();
    }
}