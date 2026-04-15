class Solution {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] >= target ){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 4;
        int index = Solution.searchInsert(arr, target);
        System.out.println("Target " + target + " should be inserted at index: " + index);
    }
}