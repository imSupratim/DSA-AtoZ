// Given an array of negative and non-negative integers. You have to make the array beautiful. An array is beautiful if two adjacent integers, arr[i] and arr[i+1] are either negative or non-negative. And you can do the following operation any number of times until the array becomes beautiful.

// If two adjacent integers are different i.e. one of them is negative and other is non-negative, remove them.
// Return the beautiful array after performing the above operation.

// Note:An empty array is also a beautiful array. There can be many adjacent integers which are different as stated above. So remove different adjacent integers as described above from left to right.
import java.util.*;

class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        st.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (st.isEmpty()) {
                st.push(arr[i]);
            } else {
                if ((st.peek() >= 0 && arr[i] >= 0) || (st.peek() < 0 && arr[i] < 0)) {
                    st.push(arr[i]);
                } else {
                    st.pop();
                }
            }
        }

        while (!st.isEmpty()) {
            list.add(st.pop());
        }
        Collections.reverse(list);
        return list;

    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, -4, 6, -2, -8, 9 };

        System.out.println("Original Array: " + Arrays.toString(arr));

        ArrayList<Integer> result = Solution.makeBeautiful(arr);

        System.out.println("Beautiful Array: " + result);
    }
}
