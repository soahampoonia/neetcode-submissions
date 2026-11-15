class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handles k >= n uniformly
        
        int[] arr = Arrays.copyOf(nums, n);
        
        // Right rotation places the last k elements at index 0
        int right = n - k;
        int left = 0;

        while (left < n) {
            if (right == n) {
                right = 0;
            }
            nums[left] = arr[right];
            right++;
            left++;
        }
    }
}