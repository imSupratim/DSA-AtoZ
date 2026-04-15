import java.util.*;

class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        
        if(s1.length() == 1){
            return false;
        }
        
        
        String anticlockwise = s1.substring(2) + s1.substring(0,2);
        
        String clockwise = s1.substring(s1.length()-2) + s1.substring(0, s1.length()-2);
        
        
        return s2.equals(anticlockwise) || s2.equals(clockwise);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        boolean result = Solution.isRotated(s1, s2);
        
        System.out.println(result);
    }
}