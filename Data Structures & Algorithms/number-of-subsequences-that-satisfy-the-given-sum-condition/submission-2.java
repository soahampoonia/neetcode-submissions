class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        int count = 0;

        int MOD = 1_000_000_007;
        int[] farr = new int[nums.length];

        farr[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            farr[i] = (farr[i - 1] * 2) % MOD;
        }

        while (left <= right) {

            if (nums[left] + nums[right] <= target) {
                count = (count + farr[right - left]) % MOD;
                left++;
            } else {
                right--;
            }
        }
        
        return count;
        
    }
}