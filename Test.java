import java.util.HashMap;
import java.util.Stack;

public class Test {
    static int getResult(String s){
        char [] arr = s.toCharArray();
        int result = 0;

        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

      //  ((()))()
      //lee(t)co((de)))


        for(char ch: arr){
            if(ch == '(' || ch == '{' || ch == '['){
                st.add(ch);
            }
            else if(ch == ')' || ch=='}' || ch==']'){
                if(st.isEmpty()){
                    result++;
                }
                else{
                    char top = st.peek();
                    if(map.get(top) == ch){
                        st.pop();
                    } 
                    else{
                        result++;
                        //((()}))
                    }
                }
            }
        }

        result += st.size();


        return result;
    }
    public static void main(String[] args){
        System.out.println(getResult("((()))()"));   // 0
        System.out.println(getResult("lee(t)co((de)))")); // 1
        System.out.println(getResult("([)]"));       // 2
        System.out.println(getResult("((("));        // 3
    }
}
