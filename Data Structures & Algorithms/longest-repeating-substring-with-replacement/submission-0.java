class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];

        int left = 0;
        int right = 0;

        int big = 0;

        int ans = 0;

        while (right < s.length()) {
            arr[s.charAt(right) - 'A']++;
            if (arr[s.charAt(right) - 'A'] > big) big = arr[s.charAt(right) - 'A'];

            while (right - left + 1 - big > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            if (right - left + 1 > ans) ans = right - left + 1;
            right++;
        }
        return ans;
    }
}
