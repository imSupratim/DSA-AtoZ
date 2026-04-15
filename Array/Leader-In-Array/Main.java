import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        list.add(arr[n-1]);
        int max = arr[n-1];
        
        for(int i = n-2; i>=0; i--){
            if(max<=arr[i]){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        
        Collections.reverse(list);
        
        return list;
    }
}

public class Main {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders = Solution.leaders(arr);
        System.out.println(leaders);
    }
}