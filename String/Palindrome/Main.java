import java.util.*;

class Solution {
    static boolean isPalindrome(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        
        int left = 0;
        int right = sb.length()-1;
        
        while(left<right){
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        
         return s.equals(sb.toString());
        
        // String str = sb.toString();
        
        // if(s.equals(str)){
        //     return true;
        // }
        // return false;
    }
}

public class Main{
    public static void main(String[] args) {
        String s = "abba";

        boolean result = Solution.isPalindrome(s);

        if(result){
            System.out.println(s+" is a palindrome.");
        }
        else{
            System.out.println(s+" is not a palindrome");
        }
    }
}