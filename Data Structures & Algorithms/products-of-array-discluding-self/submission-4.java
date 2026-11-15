class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;

        int[] arr = new int[nums.length];

        Arrays.fill(arr, 1);

        for (int i = 0; i < nums.length; i++) {
            
            arr[i] *= left;

            left = left * nums[i];
        }

        int right = 1;

        for (int j = nums.length-1; j >= 0; j--) {
            arr[j] *= right;

            right = right * nums[j];
        }
        return arr;
    }
}  
