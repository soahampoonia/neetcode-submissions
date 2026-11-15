class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1char = new int[26];
        int[] s2char = new int[26];

        if (s1.length() > s2.length()) {
            return false;
        }

       for (int i = 0; i < s1.length(); i++) {
            s1char[s1.charAt(i)-'a']++;
            s2char[s2.charAt(i)-'a']++;
       }
        
        int left = 0;
        int right = s1.length();

        while (right < s2.length()) {
            if (Arrays.equals(s1char, s2char)) return true; 
                else {
                    s2char[s2.charAt(left) - 'a']--;
                    left++;
                    s2char[s2.charAt(right)-'a']++;
                    right++;    
            }
        }
        if (Arrays.equals(s1char, s2char)) return true;
        return false;

    }
}
