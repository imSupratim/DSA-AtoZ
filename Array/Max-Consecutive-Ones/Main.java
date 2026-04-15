class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        
        for(int num: nums){
            if(num==1){
                count++;
                if(count>max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }

        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int result = Solution.findMaxConsecutiveOnes(arr);
        System.out.println("Number of max consecutive ones: "+result);
    }
}


// The time complexity of the given code is O(n), where n is the length of the input array nums. This is because the code iterates through the array exactly once, performing constant-time operations for each element.

// The space complexity is O(1), as the algorithm uses only a fixed amount of additional space (variables max and count), regardless of the size of the input array.