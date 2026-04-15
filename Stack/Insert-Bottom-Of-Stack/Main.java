import java.util.Stack;

class Solution {
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            temp.push(st.pop());
        }

        st.push(x);

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        return st;
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Original Stack: " + st);

        Solution.insertAtBottom(st, 5);

        System.out.println("After inserting at bottom: " + st);
    }
}
