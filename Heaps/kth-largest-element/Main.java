import java.util.*;

class Solution {

    static int get_Kth_Largest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int val: nums){
            minHeap.add(val);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 1, 5, 12, 2, 11, 4};
        int k = 3;

        int number = sol.get_Kth_Largest(arr, k);
        System.out.println("The "+k+"rd largest element is: "+number);
    }
}