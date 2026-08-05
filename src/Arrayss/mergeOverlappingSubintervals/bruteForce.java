package Arrayss.mergeOverlappingSubintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bruteForce {

    public static List<List<Integer>> merge(int[][] intervals) {

        // Sort intervals based on starting point
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<List<Integer>> ans = new ArrayList<>();

        int n = intervals.length;
        int i = 0;

        // Loop through intervals
        while (i < n) {
            // Start of merged interval
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i + 1;

            // Check all overlapping intervals
            while (j < n && intervals[j][0] <= end) {
                // Extend the end of current interval
                end = Math.max(end, intervals[j][1]);
                j++;
            }

            // Add merged interval to result
            ans.add(Arrays.asList(start, end));

            // Move to next non-overlapping interval
            i = j;
        }

        return ans;
    }



public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> result = merge(intervals);
        System.out.println(result);
    }
}
