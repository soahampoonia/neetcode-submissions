class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int left = 0;
        int right = 0;

        int sum = 1;

        int count = 0;

        while (left < nums.length) {
            right = left;
            sum = 1;
            while (right < nums.length) {
                sum *= nums[right];

                if (sum < k)  {
                    count++;
                } else {
                    break;
                }
                right++;
            }
            left++;
        }
        return count;
    }
}