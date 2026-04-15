// Tom is a string freak. He has got sequences of words arr[] to manipulate. If in a sequence, two same words come together then Tom destroys each other. Find the number of words left in the sequence after this pairwise destruction. 
import java.util.*;
class Solution {
    static int removeConsecutiveSame(String[] arr) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        
        for(String str: arr){
            if(st.isEmpty()){
                st.push(str);
            
            }
            else{
                if(!str.equals(st.peek())){
                    st.push(str);
                }
                else{
                    st.pop();
                }
            }
        }
        
        return st.size();
    }
}

public class Main {
    public static void main(String[] args) {
        String[] arr = {"ab", "aa", "aa", "bcd", "ab"};
        System.out.println("Result is: "+ Solution.removeConsecutiveSame(arr));
    }
}
