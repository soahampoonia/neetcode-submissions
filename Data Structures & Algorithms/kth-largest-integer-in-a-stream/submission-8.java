class KthLargest {

    PriorityQueue<Integer> minheap = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
    
    int max = 0;

    public KthLargest(int k, int[] nums) {
        max = k;
        for (int num : nums) {
            minheap.add(num);
            if (minheap.size() > max) {
                minheap.poll();
            }
        }
        
    }
    
    public int add(int val) {
        minheap.add(val);
        if (minheap.size() > max) {
            minheap.poll();
        }

        return minheap.peek();
    }
}
