import java.util.*;

class Solution{
    static boolean isPangram(String s){
        String str = "qwertyuiopasdfghjklzxcvbnm";

        for(char c: str.toCharArray()){
            if(s.indexOf(c) == -1){
                return false;
            }
        }

        return true;
    }
}

public class Main{
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = Solution.isPangram(s);

        if(result){
            System.out.println("'"+ s+"'"+ " is a pangram :)");
        }
        else{
            System.out.println(s+ " is not a pangram :(");
        }
    }
}