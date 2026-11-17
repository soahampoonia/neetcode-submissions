class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int stone : stones) {
            maxheap.add(stone);
        }

        while (maxheap.size() >= 2) {
            int x = maxheap.poll();
            int y = maxheap.poll();

            if (x == y) {
                continue;
            }
            if (x > y) {
                maxheap.add(x-y);
            }

        }

        return maxheap.isEmpty() ? 0 : maxheap.peek();


    }
}
