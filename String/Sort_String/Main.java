import java.util.*;

// User function Template for Java
class Solution {
    static String sort(String s) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(char ch: s.toCharArray()){
            list.add(ch-'a');
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        
        for(int num: list){
            sb.append((char)(num+'a'));
        }
        return sb.toString();
        
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to sort it: ");
        String str = sc.nextLine();
        System.out.println("Entered string: "+str);
        String answer = Solution.sort(str);
        System.out.println("Sorted string is: "+answer);
        
    }
}