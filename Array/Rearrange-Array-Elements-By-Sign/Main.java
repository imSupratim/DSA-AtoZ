import java.util.*;

class Solution {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for(int i=0; i<n; i++){
            if(nums[i] >= 0){
                arr[posIndex] = nums[i];
                posIndex+=2;
            }
            else{
                arr[negIndex] = nums[i];
                negIndex+=2;
            }
        }

        return arr;
    }

    //Time complexity - O(n) {for traversing the array}
    //Space complexity - O(n) {extra array is there}
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] rearranged = Solution.rearrangeArray(nums);
        System.out.println(Arrays.toString(rearranged));
    }
}