import java.util.Stack;

class Solution {
    static void reverse(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int num : arr) {
            st.push(num);
        }

        int i = 0;
        while (!st.isEmpty()) {
            arr[i] = st.pop();
            i++;
        }
    }
}

public class Main {

    private static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Solution.reverse(arr);
        display(arr);
    }
}