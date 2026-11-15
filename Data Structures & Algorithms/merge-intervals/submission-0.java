class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        if (intervals.length == 0) return new int[][]{{}};

        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int curstart = intervals[i][0];
            int curend = intervals[i][1];
            
            if (end > curend) {
                continue;
            }
            
            if (end < curend && end >= curstart) {
                end = curend;
            }

            if (end < curstart) {
                list.add(new int[]{start, end});
                start = curstart;
                end = curend;
            }
        }
        list.add(new int[]{start, end});
        return list.toArray(new int[list.size()][]);
    }
}



// [3, 5], [1, 7], [2, 9]

// if end > curend and start < curend then  {
//start = math.min(curStart, start)
// continue,
// else end = curend