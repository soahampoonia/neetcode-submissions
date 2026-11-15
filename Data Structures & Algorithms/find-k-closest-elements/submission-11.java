class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int[] poop = new int[arr.length];

        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b) -> {
            
            if (poop[a] != poop[b]) {
                return Integer.compare(poop[a], poop[b]);
            }

            return Integer.compare(arr[a], arr[b]);
        });

        for (int i = 0; i < arr.length; i++) {
            poop[i] = Math.abs(arr[i] - x);
        }

        for (int count = 0; count < arr.length; count++) {
            minheap.add(count);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            list.add(arr[minheap.poll()]);
        }

        Collections.sort(list);

        return list;
    }
}