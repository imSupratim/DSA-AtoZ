// reference solution NeetCode youtube  

class Solution {
    public static boolean check(int[] nums) {
        int length = nums.length;

        if( length==1 ){
            return true;
        }
        int count = 1; 

        for(int i=1; i<(2 * length); i++){
            if(nums[(i-1) % length] <= nums[i % length]){
                count++;
            }
            else{
                count=1;
            }

            if(count == length){
                return true;
            }
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,4,5,5,1,2};
        boolean result = Solution.check(arr);
        System.out.println("Result is: "+ result);

    }
}
