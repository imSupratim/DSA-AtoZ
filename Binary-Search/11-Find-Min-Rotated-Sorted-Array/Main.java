class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        
        while(left<right){
            int mid = left + (right - left)/2;

            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }

        return nums[left];
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,4,5,1,2};
        System.out.println(sol.findMin(nums)); // Output: 1
    }
}