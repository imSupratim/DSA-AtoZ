class Solution {
    public static int removeDuplicates(int[] nums) {
        int i=0; 
        for(int j=1; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                nums[++i] = nums[j];
            }
        }

        return i+1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,5,6};
        int result  = Solution.removeDuplicates(arr);
        System.out.println("Number of distinct element: "+result);
    }
}
