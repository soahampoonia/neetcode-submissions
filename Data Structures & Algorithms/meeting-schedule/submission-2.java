/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        if (intervals.size() == 0) return true;

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++) {
            
            int curstart = intervals.get(i).start;
            int curend = intervals.get(i).end;

            if (end > curstart) {
                return false;
            }

            start = curstart;
            end = curend;
        }
        return true;

    }
}
