/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author chen
 */
public class InsertInterval {
    public  List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        Collections.sort(intervals, new IntervalComparator());

        List<Interval> result = new ArrayList<>();
        result.add(intervals.get(0));
        Interval prev;
        Interval curr;

        for (int i = 1; i < intervals.size(); i++) {
            prev = result.get(result.size() - 1);
            curr = intervals.get(i);
            if (curr.start <= prev.end) {
                prev.end = curr.end > prev.end ? curr.end : prev.end;
            } else {
                result.add(curr);
            }
        }

        return result;
    }

    public class IntervalComparator implements Comparator<Interval> {

        @Override
        public int compare(Interval i1, Interval i2) {
            if (i1.start == i2.start) {
                return i1.end - i2.end;
            }
            return i1.start - i2.start;
        }
    }

    public class Interval {

        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    
}
