class Solution {
    public int search(int[] nums, int target) {
        int left =0;

        int right = nums.length-1;

        while (left <= right) {
            
            int mid = (right - left)/2 + left;
            
            if (nums[mid] == target) return mid;

            // Step 1: Determine which half is perfectly sorted
if (nums[left] <= nums[mid]) { 
    
    // The left half is perfectly sorted.
    // Step 2a: Is the target strictly within this sorted left half?
    if (target >= nums[left] && target < nums[mid]) {
        right = mid - 1;
    } else {
        left = mid + 1;
    }

} else { 
    
    // The right half is perfectly sorted.
    // Step 2b: Is the target strictly within this sorted right half?
    if (target > nums[mid] && target <= nums[right]) {
        left = mid + 1;
    } else {
        right = mid - 1;
    }
    
}
        }
        return -1;
    }
}
