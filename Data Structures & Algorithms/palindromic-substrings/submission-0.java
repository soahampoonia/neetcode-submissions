class Solution {
    public int countSubstrings(String s) {
        int x = 0;

        int count = 0;

        while (x < s.length()) {

            if (x > 0 && s.charAt(x - 1) == s.charAt(x)) {
                int left = x - 1;
                int right = x;

                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    count++;
                    left--;
                    right++;
                }
            }

            int left = x;
            int right = x;


            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
            x++;
        }
        return count;
    }
}
