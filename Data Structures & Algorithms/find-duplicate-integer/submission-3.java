class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        
        slow = nums[slow];
        fast = nums[nums[fast]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int phase2 = 0;

        while (slow != phase2) {
            slow = nums[slow];
            phase2 = nums[phase2];
        }
        return phase2;
        
    }
}
