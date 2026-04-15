class Solution {
    public static int singleNumber(int[] nums) {
        int xorr = 0;
        for(int num: nums){
            xorr =  xorr^num;
        }
        return xorr;


        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int val: nums){
        //     map.put(val, map.getOrDefault(val, 0)+1);
        // }

        // for(int val: nums){
        //     if(map.get(val)==1){
        //         return val;
        //     }
        // }

        // return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 3, 3, 4}; // Example input
        System.out.println("Single Number is: "+Solution.singleNumber(nums)); // Output: 4
    }
}