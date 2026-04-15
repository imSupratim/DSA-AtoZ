import java.util.*;

class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[i]<=stack.peek()){
                stack.pop();
            }
            
            if( stack.isEmpty() ){
                res[i] = -1;
            }
            else{
                res[i] = stack.peek();
            }
            
            stack.push(arr[i]);
        }
        
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        Solution solution = new Solution();
        int[] result = solution.leftSmaller(arr);
        System.out.println(Arrays.toString(result)); // Output: [-1, 4, -1, 2, 2]
    }
}