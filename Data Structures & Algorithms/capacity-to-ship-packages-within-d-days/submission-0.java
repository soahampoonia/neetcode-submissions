class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int weight : weights) {
            if (weight > max) max = weight;
            sum += weight;
        }

        return binarySearch(max, sum, days, weights);

    }

    public int binarySearch(int left, int right, int target, int[] day) {

        while (left <= right) {
            int mid = ((right - left)/ 2) + left;

            if (doesWork(mid, day, target) == true) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean doesWork(int val, int[] nums, int dayz) {
        int sum = 0;
        int day = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > val) {
                day++; 
                sum = nums[i]; 
            } 
        }
        if (day <= dayz) return true;

        return false;

    }
}