class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;

        for (String str : strs) {
            if (str.length() < minLen) minLen = str.length();
        }
        if (minLen == 0) return "";
        
        int max = 0;
        char match = strs[0].charAt(0);
       for (int i = 0; i < minLen; i++) {
            match = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != match) return strs[0].substring(0,i); 
            }
       }
       return strs[0].substring(0,minLen);

    }
}