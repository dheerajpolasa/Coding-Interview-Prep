/*
Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually exclusive intervals.

Example 1:

Intervals: [[1,4], [2,5], [7,9]]
Output: [[1,5], [7,9]]
Explanation: Since the first two intervals [1,4] and [2,5] overlap, we merged them into 
one [1,5].

Example 2:

Intervals: [[6,7], [2,4], [5,9]]
Output: [[2,4], [5,9]]
Explanation: Since the intervals [6,7] and [5,9] overlap, we merged them into one [5,9].
 
Example 3:

Intervals: [[1,4], [2,6], [3,5]]
Output: [[1,6]]
Explanation: Since all the given intervals overlap, we merged them into one.



*/

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

class Solution {
  public static List<Interval> merge(List<Interval> intervals) {
    List<Interval> mergedIntervals = new ArrayList<>();
    Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
    
    Iterator<Interval> iterator = intervals.iterator();
    Interval interval = iterator.next();
    int start = interval.start;
    int end = interval.end;
    
    while(iterator.hasNext()) {
      interval = iterator.next();
      if(interval.start <= end) {
        end = Math.max(interval.end, end);
      } else {
        mergedIntervals.add(new Interval(start, end));
        start = interval.start;
        end = interval.end;
      }
    }
    
    mergedIntervals.add(new Interval(start, end));
    return mergedIntervals;
  }
}
