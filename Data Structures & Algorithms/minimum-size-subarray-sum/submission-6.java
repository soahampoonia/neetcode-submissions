class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;

        int sum = 0;

        int minSize = Integer.MAX_VALUE;

        Boolean madeIt = false;

        while (right < nums.length) {
            
            sum += nums[right];

            while (sum >= target) {
                if (right - left + 1 < minSize) minSize = right - left + 1;
                sum -= nums[left];
                if (left+1 < nums.length) left++;
                madeIt = true;
            }
            right++;
        }

        if (madeIt == false) {
            return 0;
        } 

        return minSize;
    }
}