import java.util.Arrays;
import java.util.Scanner;

public class Memoization {
    static int function(int n, int[] heights, int[] dp, int k){
        if(n==0) return 0;

        if(dp[n] != -1) return dp[n];

        int min = Integer.MAX_VALUE;
        for(int j=1; j<=k; j++){
            if(n-j>=0){
                int jump = function(n-j, heights, dp, k) + Math.abs(heights[n]-heights[n-j]);
                min = Math.min(min, jump);
            }
        }
        dp[n] = min;
        return dp[n];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = {30 , 10, 60, 10, 60, 50};
        int n = heights.length;
        int k = sc.nextInt();   
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int result = function(n-1, heights, dp, k);
        System.out.println(result);
    }
}
