class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        if (s.length() != t.length()) return false;

        for (char i : s.toCharArray()) {
            arr[i-'a']++;
        }

        for (char j : t.toCharArray()) {
            arr[j - 'a']--;
            if (arr[j-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
