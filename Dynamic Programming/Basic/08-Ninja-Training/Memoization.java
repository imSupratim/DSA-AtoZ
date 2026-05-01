import java.util.*;

public class Memoization {
    public static int function(int day, int last, int points[][], int[][] dp){
        if(dp[day][last] != -1) return dp[day][last];

        if(day == 0){
            int maxi = 0;
            for(int task = 0; task<3; task++){
                if(task != last){
                    maxi = Math.max(maxi, points[0][task]);
                }
            }
            return maxi;
        }


        int maxi = 0;
        for(int task = 0; task<3; task++){
            if(task != last){
                int point = points[day][task] + function(day-1, task, points, dp);
                maxi = Math.max(maxi, point);
            }
        }
        return dp[day][last] = maxi;
    }
    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        int[][] dp = new int[n][4];

        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return function(n-1, 3, points, dp);
    }

}