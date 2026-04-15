class Solution {
    public static void moveZeroes(int[] nums) {
        int insertPosition = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }

        while(insertPosition < nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
        }
    }
}
public class Main {
    private static void display(int[] arr){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,0,3,2,0,4,5};
        System.out.print("Array Before: ");
        display(arr);
        Solution.moveZeroes(arr);
        System.out.print("Array after: ");
        display(arr);
    }
}
