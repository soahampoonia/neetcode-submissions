class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b) -> Integer.compare(b, a));

        if (tasks.length == 0) return 0;

        int time  = 0;

        int[] temp = new int[26];

        for (int i = 0; i < tasks.length; i++) {
            temp[tasks[i] - 'A']++;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                maxheap.add(temp[i]);
            }
        }

        Deque<int[]> qu = new ArrayDeque<>();

        int curr = 0;

        while (!maxheap.isEmpty() || !qu.isEmpty()) {

            time++;
            
            if (maxheap.size() > 0) {
                curr = maxheap.poll();
                curr = curr - 1;

                if (curr > 0) {
                    qu.add(new int[]{curr, time + n});
                }
            }

            while (!qu.isEmpty() && qu.peek()[1] == time) {
                    maxheap.add(qu.poll()[0]);
                }    

        }
        return time;

    }
}
