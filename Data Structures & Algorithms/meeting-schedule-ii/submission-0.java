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
    public int minMeetingRooms(List<Interval> intervals) {
        int[] start = new int[intervals.size()];
        
        for (int i = 0; i < intervals.size(); i++) {
            start[i] = intervals.get(i).start;
        }

        int[] end = new int[intervals.size()];

        for (int i = 0; i < intervals.size(); i++) {
            end[i] = intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int s = 0;
        int e = 0;

        int count = 0;
        int maxreq = 0;

        for (int i = 0; i < intervals.size(); i++) {
            if (start[s] < end[e]) {
                s++;
                count++;
                if (count > maxreq) maxreq = count;
            } else {
                e++;
                count--;
            }
            
        }
        return maxreq;
    }
}
