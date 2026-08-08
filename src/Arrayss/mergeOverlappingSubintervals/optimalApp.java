package Arrayss.mergeOverlappingSubintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class optimalApp {

    public static List<List<Integer>> merge(int[][] intervals) {

        // Step 1: Sort by starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();

        for (int[] interval : intervals) {

            // If list is empty OR no overlap
            if (ans.isEmpty() || ans.get(ans.size() - 1).get(1) < interval[0]) {
                ans.add(Arrays.asList(interval[0], interval[1]));
            }

            // Overlap exists
            else {
                int last = ans.size() - 1;
                int maxEnd = Math.max(ans.get(ans.size() - 1).get(1), interval[1]);
                ans.get(last).set(1, maxEnd);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {10,14},
                {15, 18}
        };

        List<List<Integer>> result = merge(intervals);
        System.out.println(result);

    }
}

//time complexity = O(nlogn)
//space complexity = O(n)
