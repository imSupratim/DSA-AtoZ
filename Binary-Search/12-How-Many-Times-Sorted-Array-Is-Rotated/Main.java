class Solution{
    int countRotation(int[] nums){
        // write your code here 
        int low = 0, high = nums.length-1;
        
        while(low<high){
            int mid = low+(high-low)/2;

            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high =mid;
            }
        }
        
        return low;
    
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // int[] arr = {7 ,9 ,12 ,15, 2, 4, 5};
        int[] arr = {10 ,20 ,30, 5, 7, 8};

        int number = sol.countRotation(arr);
        System.out.println("The Array is rotated "+number+" times.");
    }
}
