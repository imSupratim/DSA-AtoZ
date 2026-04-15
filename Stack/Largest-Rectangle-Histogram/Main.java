import java.util.*;

class Solution {
    public static int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nsl = new int[n];
        int[] nsr = new int[n];

        getNSL(heights, nsl);
        getNSR(heights, nsr);


        int Max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int area = heights[i] * (nsr[i]-nsl[i]-1);
            Max=Math.max(area, Max) ;
        }

        return Max;
    }

    private static void getNSL(int[] arr, int[] res){
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(i);
        }
    }


    private static void getNSR(int[] arr, int[] res){
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i]=arr.length; // store the length of the array if no
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = Solution.largestRectangleArea(heights);
        System.out.println("Area of the largest rectangle in histogram: " + result); // Output: 10
    }
}