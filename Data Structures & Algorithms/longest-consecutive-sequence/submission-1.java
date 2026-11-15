class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // Guard against empty arrays
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int n : set) {
            // Only start if 'n' is the true beginning of a sequence
            if (!set.contains(n - 1)) {
                int currentNum = n;
                int counter = 1; // Reset counter for this specific sequence

                // Look for the next numbers, updating currentNum as we go
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    counter++;
                }

                // Update max after the while loop finishes finding the whole sequence
                if (counter > max) {
                    max = counter;
                }
            }
        }
        
        return max;
    }
}