class Solution {
    public String longestPalindrome(String s) {
        int x = 0;

        int max = 0;

        int finleft = 0;
        int finrig = 0;

        while (x < s.length()) {
            int count = 0;
            if (x > 0 && s.charAt(x - 1) == s.charAt(x)) {
                int left = x-1;
                int right = x;

                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    count++;
                    if (right - left + 1 > max) {
                        max = right - left + 1;
                        finleft = left;
                        finrig = right;
                    }
                    left--;
                    right++;
                }
            } 
            
            int left = x;
            int right = x;
             count = 0;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                if (right - left + 1 > max) {
                    max = right - left + 1;
                    finleft = left;
                    finrig = right;
                }
                left--;
                right++;
            }
            x++;
        }
        return s.substring(finleft, finrig + 1);
    }
}
