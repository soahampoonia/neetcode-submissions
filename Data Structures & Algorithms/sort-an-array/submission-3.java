class Solution {
    public int[] sortArray(int[] nums) {
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a, b) -> Integer.compare(a, b));

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            minheap.add(nums[i]);
        }

        for (int n = 0; n < nums.length; n++) {
            arr[n] = minheap.poll();
        }
        return arr;
    }
}