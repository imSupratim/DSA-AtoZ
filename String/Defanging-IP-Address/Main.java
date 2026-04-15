import java.util.*;

class Solution {
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<address.length(); i++){
            if(address.charAt(i) == '.'){
                sb.append("[.]");
            }
            else{
                sb.append(address.charAt(i));
            }
        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String result = Solution.defangIPaddr(address);
        System.out.println("Defanged IP address: " + result);
    }
}