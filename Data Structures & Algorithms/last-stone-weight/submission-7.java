class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : stones) {
            minheap.add(num);
        }

        while (minheap.size() > 1) {
            int x = minheap.poll();
            int y = minheap.poll();

            if (x == y) continue;

            minheap.add(x-y);
            
        }

        if (minheap.size() == 1) {
            return minheap.peek();
        }

        return 0;
    }
}
