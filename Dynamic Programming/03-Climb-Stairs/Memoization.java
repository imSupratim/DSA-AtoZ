import java.util.Arrays;
import java.util.Scanner;

public class Memoization {
    
    static int countWays(int n, int[] dp){
        if(n==0 || n==1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = countWays(n-1, dp) + countWays(n-2, dp);
        return dp[n];
    }
    

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(countWays(n, dp));
    }
}


