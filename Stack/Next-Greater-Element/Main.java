import java.util.*;

class Solution {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack =  new Stack<>();
        
        for(int i = arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(stack.peek());
            }
                stack.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }

}

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        ArrayList<Integer> result = Solution.nextLargerElement(arr);
        System.out.println(result); // Output: [5, 10, 10, -1, -1]
    }
}