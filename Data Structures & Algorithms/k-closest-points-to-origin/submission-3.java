class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minheap = new PriorityQueue<>((a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

        for (int i = 0; i < points.length; i++) {
            minheap.add(points[i]);
            if (minheap.size() > k) {
                minheap.poll();
            }
        }



        int[][] matrix = new int[minheap.size()][2];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = minheap.poll();
        }

        return matrix;

    }
}
