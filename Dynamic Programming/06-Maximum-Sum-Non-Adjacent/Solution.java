import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n = nums.size();
		int[] dp = new int[n];
		dp[0]=nums.get(0);
		for(int i=1; i<n; i++){
			int pick = nums.get(i);
			if(i>1){
				pick += dp[i-2];
			}
			int non_pick = 0 + dp[i-1]; 
			dp[i] = Math.max(pick,  non_pick);
		}
		return dp[n-1];
	}
}