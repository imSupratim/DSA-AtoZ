import java.util.*;

class Solution {
    public static ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        
        for(int i=0 ;i<n; i++){
            res[i]=-1;
        }
        
        for(int i = 2*n-1; i>=0; i--){
            int curr = arr[i % n];
            while(!stack.isEmpty() && curr>=stack.peek()){
                stack.pop();
            }
            
            if(i<n && !stack.isEmpty()){
                res[i] = stack.peek();
            }
            stack.push(curr);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int val: res){
            list.add(val);
        }
        
        return list;
        
        
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        ArrayList<Integer> result = Solution.nextGreater(arr);
        System.out.println(result); // Output: [2, -1, 2]
    }
}