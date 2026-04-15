class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        int totalJumps = 0;
        int coverage = 0;
        int lastJumpIndex = 0;
        
        for(int i=0; i<n-1; i++){
            coverage = Math.max(coverage, i+arr[i]);
            
            if(i==lastJumpIndex){
                totalJumps++;
                lastJumpIndex = coverage;
            }
            
            if(lastJumpIndex >= n-1){
                return totalJumps;
            }
        }
        
        return -1;
        
    }
}

public class Main{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {2, 3, 1, 1, 4};

        System.out.println("Minimum jumps required: " + sol.minJumps(nums));
    }
}