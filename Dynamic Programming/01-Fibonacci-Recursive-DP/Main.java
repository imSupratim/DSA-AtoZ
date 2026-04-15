import java.util.Arrays;
import java.util.Scanner;

class Solution{
    public int fib(int n, int[] dp){
        if(n<=1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }
}


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        Solution sol = new Solution();
        System.out.println(sol.fib(n, dp));
    }
<<<<<<< HEAD
}
=======
}


//time comp: O(n)
// space comp: O(n) + O(n)

>>>>>>> 904273d (Commit)
