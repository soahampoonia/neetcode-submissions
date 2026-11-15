class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;

        int[] sarr = new int[128];

        int[] tarr = new int[128];

        int matches = 0;

        int max = 0;

        int min = Integer.MAX_VALUE;

        int start = 0; int dist = 0;

        for (int i = 0; i < t.length(); i++) {
            tarr[t.charAt(i)]++;
            max++;

        }
        
        while (right < s.length()) {
            
            sarr[s.charAt(right)]++;

            if (sarr[s.charAt(right)] <= tarr[s.charAt(right)]) {
                matches++;
            }
            while (matches >= max) {
                    
                    if (right - left < min) {
                         min = right - left;
                         start = left;
                        dist = right - left + 1;
                    }
                   
                    sarr[s.charAt(left)]--;
                    if (sarr[s.charAt(left)] < tarr[s.charAt(left)]) {
                        matches--;
                    }
                    left++;
                    
            }
            right++;
        }

        if (min == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, dist + start);
    }
}
