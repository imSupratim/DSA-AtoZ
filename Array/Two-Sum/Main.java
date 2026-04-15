import java.util.*;

class Solution{
    static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int comp = target-nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}

public class Main{
    public static void main(String[] args) {
        int[] nums = {11,15,7,2};
        int target = 9;

        int []result = Solution.twoSum(nums, target);

        System.out.println("Two indices are: "+result[0]+ " and "+result[1]);
    }
}