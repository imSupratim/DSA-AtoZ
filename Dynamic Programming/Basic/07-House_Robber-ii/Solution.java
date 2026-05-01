class Solution {
    public int firstInclude(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        dp[0]=nums[0];
        for(int i=1; i<n-1; i++){
            int pick = nums[i];
            if(i>1){
                pick += dp[i-2];
            }
            int non_pick = 0 + dp[i-1];

            dp[i] = Math.max(pick, non_pick);
        }
        return dp[n-2];
    }

    public int secondInclude(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        dp[1]=nums[1];
        for(int i=2; i<n; i++){
            int pick = nums[i];
            if(i>1){
                pick += dp[i-2];
            }
            int non_pick = 0 + dp[i-1];
            dp[i] = Math.max(pick, non_pick);
        }
        return dp[n-1];
    }

    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int firstIncluded = firstInclude(nums);
        int secondIncluded = secondInclude(nums);
        return Math.max(firstIncluded, secondIncluded);
    }
}