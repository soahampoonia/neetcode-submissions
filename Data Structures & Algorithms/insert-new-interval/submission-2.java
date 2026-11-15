class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int i = 0;

        List<int[]> result = new ArrayList<>();

        // Phase 1: copy intervals completely before newInterval
        while (i < intervals.length && newInterval[0] > intervals[i][1]) {
            result.add(intervals[i]);
            i++;
        }

        // Phase 2: expand newInterval across overlaps
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            int start = Math.min(intervals[i][0], newInterval[0]);
            int end = Math.max(intervals[i][1], newInterval[1]);

            newInterval[0] = start; newInterval[1] = end;
            i++;
        }

        result.add(newInterval);

        // Phase 3: copy everything remaining
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
           
        int[][] array = result.toArray(int[][]::new);
        return array;
       
    }
}
