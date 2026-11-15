class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // Skip numbers that have a predecessor.
            if (num != Integer.MIN_VALUE && set.contains(num - 1)) {
                continue;
            }

            int curr = num;
            int length = 1;

            while (curr != Integer.MAX_VALUE && set.contains(curr + 1)) {
                curr++;
                length++;
            }

            longest = Math.max(longest, length);
        }

        return longest;
    }
}