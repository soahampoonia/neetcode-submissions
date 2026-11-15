class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();


        int left = 0;
        int right = 0;

        int max = 0;
        

       while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                if (right - left > max) max = right - left;
            } else {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
                right++;
            }
       }

       return max;

    }
}
