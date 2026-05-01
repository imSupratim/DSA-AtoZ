import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int function(int ind, ArrayList<Integer> nums, int[] dp){
		if(ind == 0) return nums.get(ind);
		if(ind < 0) return 0;
		if (dp[ind] != -1) return dp[ind];

		int pick = nums.get(ind) + function(ind-2, nums, dp);
		int non_pick = 0 + function(ind-1, nums, dp);

		dp[ind] = Math.max(pick, non_pick);
		return dp[ind];
	}

	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n = nums.size();
		int[] dp = new int[n];
		Arrays.fill(dp, -1);

		int result = function(n-1, nums, dp);
		return result;
	}
}