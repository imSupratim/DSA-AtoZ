class Solution {
    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;

        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot==-1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i = n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        reverse(nums, pivot+1, n-1);
    }

    private static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution.nextPermutation(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }
}