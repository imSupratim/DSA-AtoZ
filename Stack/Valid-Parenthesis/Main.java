import java.util.*;

class Solution {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char top = st.pop();
                    if(map.get(top)!=ch){
                        return false;
                    }
                }
            }
        }

        return st.isEmpty();
    }
}
public class Main {
    public static void main(String[] args) {
        String s = "([])}";
        boolean result = Solution.isValid(s);
        if(result){
            System.out.println("Yes it is valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
