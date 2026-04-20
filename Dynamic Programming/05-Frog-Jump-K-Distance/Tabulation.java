import java.util.Arrays;
import java.util.Scanner;

public class Tabulation {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = {30 , 10, 60, 10, 60, 50};
        int n = heights.length;
        int k = sc.nextInt();   
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        dp[0] = 0;
        for(int i=1; i<n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=1; j<=k; j++){
                if(i-j>=0){
                    int jump = dp[i-j] + Math.abs(heights[i] - heights[i-j]);
                    min = Math.min(min, jump);
                }
            }
            dp[i] = min;
        }
        System.out.println(dp[n-1]);
        
    }
}
