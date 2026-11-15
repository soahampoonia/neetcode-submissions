class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
        Deque<Integer> dqu = new ArrayDeque<>();

        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
    // 1. Evict expired elements from front (only relevant once i >= k)
           if (!dqu.isEmpty() && dqu.peekFirst() < i - k + 1) {
                dqu.pollFirst();
            }
            while (!dqu.isEmpty() && nums[dqu.peekLast()] <= nums[i]) {
                dqu.pollLast();
            }
            dqu.offerLast(i);
    
            if (i >= k - 1) {
                result[i - k + 1] = nums[dqu.peekFirst()];
            }   
        }
       
    return result;

    }
}
