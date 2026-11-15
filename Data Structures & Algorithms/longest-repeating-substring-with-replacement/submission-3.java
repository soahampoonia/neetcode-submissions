class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            counts[s.charAt(right) - 'A']++;

            while (right - left + 1 - highestCount(counts) > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    private int highestCount(int[] counts) {
        int highest = 0;
        for (int count : counts) {
            highest = Math.max(highest, count);
        }
        return highest;
    }
}