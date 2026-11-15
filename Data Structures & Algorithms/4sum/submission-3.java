class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        int target2sum = 0;
        int target3sum = 0;
        long target4sum = 0;

    

        List<List<Integer>> listy = new ArrayList<>();
            
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if ( j > i + 1 && j > 0 && nums[j] == nums[j - 1]) continue; 
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    
                    if (left == i || left == j) {
                        left++;
                        continue;
                    }
                    if (right == i || right == j) {
                        right--;
                        continue;
                    }

                    target4sum = (long)target - nums[i] - nums[j] - nums[left] - nums[right];
                    

                    if (target4sum == 0) {
                        listy.add(List.of(nums[i], nums[j], nums[left], nums[right])); 
                        
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (right > left && nums[right] == nums[right + 1]) right--;

                    }
                    if (target4sum < 0) {
                        right--;
                    } else if (target4sum > 0) {
                        left++;
                    }
            }
        }   
    }

    return listy;
        
    }
}