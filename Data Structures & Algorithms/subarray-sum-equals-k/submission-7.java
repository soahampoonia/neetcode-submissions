class Solution {
    public int subarraySum(int[] nums, int k) {
        int left = 0;
        int right = 0;

        int sum = 0;

        int counter = 0;;

        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    counter++;
                }
            }
        }

        return counter;
    }
}