class Solution {
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int val: nums){
            currentSum += val;
            maxSum = Math.max(currentSum, maxSum);

            if(currentSum < 0){
                currentSum = 0;
            }
        }

        return maxSum;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: "+Solution.maxSubArray(nums));
    }
}