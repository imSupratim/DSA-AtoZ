import java.util.PriorityQueue;

class Solution {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++){
            minHeap.add(nums[i]);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int K = 4;
        int result = Solution.findKthLargest(arr, K);

        System.out.println("Kth largest element: "+result);
    }
}
