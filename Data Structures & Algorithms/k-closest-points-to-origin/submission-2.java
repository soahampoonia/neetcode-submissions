class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minheap = new PriorityQueue<>((int[]a,int[]b) -> Integer.compare(b[0]*b[0] + b[1]*b[1], a[0]*a[0] + a[1]*a[1]));


            for (int arr[] : points) {
                minheap.add(arr);
                if (minheap.size() > k) {
                    minheap.poll();
                }
            }

            int[][] result = new int[k][2];

            for (int i = 0; i < k; i++) {
                result[i] = minheap.poll();
            }
        
        return result;    

    }
}
