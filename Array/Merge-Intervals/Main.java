import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        int row = intervals.length;
        ArrayList<ArrayList<Integer>> merged = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i<row; i++){
            if( end >= intervals[i][0] ){
                end = Math.max(end, intervals[i][1]);
            }
            else{
                ArrayList<Integer> sublist = new ArrayList<>();
                sublist.add(start);
                sublist.add(end);
                merged.add(sublist);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        ArrayList<Integer> sublist = new ArrayList<>();
                sublist.add(start);
                sublist.add(end);
                merged.add(sublist);

        int[][] result = new int[merged.size()][2];
        for(int i=0; i<merged.size(); i++){
            result[i] = new int[]{merged.get(i).get(0), merged.get(i).get(1)};
        }

        return result;
        
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] intervals = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        int[][] arr = sol.merge(intervals);

        for (int[] nums : arr) {
            System.out.print(
                "[" + nums[0] + "," + nums[1] + "] "
            );
        }
    }
}