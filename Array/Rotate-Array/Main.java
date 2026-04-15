class Solution {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k=k%len;
        reverse(nums, 0, len-k-1);
        reverse(nums, len-k, len-1);
        reverse(nums, 0, len-1);
    }

    private static void reverse(int[]arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        System.out.print("Array Before: ");
        display(nums);
        Solution.rotate(nums, 3);
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
