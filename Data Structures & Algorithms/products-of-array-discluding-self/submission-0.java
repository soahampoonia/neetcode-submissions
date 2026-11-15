class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        
        int[] result = new int[nums.length];
        Arrays.fill(result,1);
        
        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left = nums[i] * left;
        }
        int right = 1;

        for (int i = nums.length-1 ; i >= 0; i--) {
            result[i] *= right;
            right = nums[i] * right;
        }
        
        return result;
    }
}  
