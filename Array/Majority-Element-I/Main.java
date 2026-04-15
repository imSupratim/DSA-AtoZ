// Also known as Moores voting algorithm

import java.util.*;

class Solution {
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        int n = nums.length;

        for(int val: nums){
            if(count == 0){
                candidate = val;
                count++;
            }
            else if(val == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        return candidate;
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

public class Main {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println("Majority Element: "+Solution.majorityElement(nums));
    }
}