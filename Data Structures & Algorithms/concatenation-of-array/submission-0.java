class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length*2;

        int[] res = new int[size];

        int half = 0;

        for (int i = 0; i < size; i++) {
            if (half == nums.length) half = 0;
            res[i] = nums[half];
            half++;
        }
        return res;
    }
}