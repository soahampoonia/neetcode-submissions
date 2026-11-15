class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s2.length() < s1.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int left = 0;
        int right = s1.length();

        HashMap<Character, Integer> mapp = new HashMap<>();
        
        int x = 0;
        while (x < right) {
            mapp.put(s2.charAt(x), mapp.getOrDefault(s2.charAt(x), 0) + 1);
            x++;
        }

        while (right < s2.length()) {
            if (mapp.equals(map)) return true;
            
            char outgoing = s2.charAt(left);
            int count = mapp.get(outgoing) - 1;

            if (count == 0) {
                mapp.remove(outgoing);
            } else {
                mapp.put(outgoing, count);
            }

            mapp.put(s2.charAt(right), mapp.getOrDefault(s2.charAt(right), 0) + 1);
            right++;
            left++;
        }
        return map.equals(mapp);
    }
}
