class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        if (intervals.length == 0) return 0;

        int start = intervals[0][0];
        int end = intervals[0][1];

        int count = 0;
        
        for (int i = 1; i < intervals.length; i++) {
           
            int curstart = intervals[i][0];
            int curend = intervals[i][1];

            if (end > curstart) {
                if (end > curend) {
                    result.add(new int[]{curstart, curend});
                    start = curstart;
                    end = curend;
                    count++;
                    continue;
                } else {
                    result.add(new int[]{start, end});
                    count++;
                    continue;
                }
            }
            result.add(new int[]{curstart, curend});
            start = curstart;
            end = curend;
        }
        return count;
    }
}
// [1, 5], [1, 3], [2, 7], [4, 5]
