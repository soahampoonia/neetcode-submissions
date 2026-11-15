class Solution {
    public int jump(int[] nums) {
        int index = 0;
        int count = 0;
        while (index < nums.length - 1) {
            if (index + nums[index] >= nums.length - 1) {
    count++;
    break;
}
            int range = nums[index];

            int greatest = Integer.MIN_VALUE;
            int bestind = 0;

            for (int i = index + 1; i < nums.length && i < index + range + 1; i++) {
                
                if (i + nums[i] >= nums.length -1) {
                    bestind = i;
                    break;
                }
                if (i + nums[i] > greatest) {
                    greatest = i + nums[i];
                    bestind = i;
                }
            }
            index = bestind;
            count++;
        }
        return count;
    }
}
