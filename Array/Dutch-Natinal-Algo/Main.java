class Solution {
    public static void sortColors(int[] nums) {
        //Dutch National Flag Algo;
        //Time comp = O(n);
        //Space comp = O(1);

        int n = nums.length;
        int low=0, mid=0, high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        System.out.print("Array Before: ");
        display(nums);
        Solution.sortColors(nums);
        System.out.print("Array After: ");
        display(nums);

    }

    private static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}