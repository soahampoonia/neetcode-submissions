class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Fast-forward the left pointer past any non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            
            // Rewind the right pointer past any non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // If the characters don't match (ignoring case), it's not a palindrome
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // Move both pointers inward for the next comparison
            left++;
            right--;
        }

        return true;
    }
}