class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;


        int count = 0;

        while (left < nums.length) {
            int sum = 1;
            
            right = left;
            
            while (right < nums.length) {
                
                sum *= nums[right];
                
                if (sum < k) {
                    count++;
                }else {
                    break;
                }
                right++;
            }
            left++;
        }
    
    return count;
        
    }
}