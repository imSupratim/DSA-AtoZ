import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list =  new ArrayList<>();
        
        for(int nums: a){
            set.add(nums);
        }
        
        for(int nums: b){
            set.add(nums);
        }
        
        for(int nums: set){
            list.add(nums);
        }
        
        return list;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7};
        ArrayList<Integer> list = Solution.findUnion(arr1, arr2);
        System.out.println(list);
    }
}



// Time Complexity:
// - Adding all elements from array a to the HashSet takes O(n), where n is the length of array a.
// - Adding all elements from array b to the HashSet takes O(m), where m is the length of array b.
// - Iterating over the HashSet to transfer elements to the ArrayList takes O(k), where k is the number of unique elements in the union.
// - Overall, the total time complexity is O(n + m + k). Since k ≤ n + m, it simplifies to O(n + m).

// Space Complexity:
// - The HashSet stores at most all unique elements from both arrays, so it requires O(n + m) space in the worst case.
// - The ArrayList stores the union elements, which is also at most O(n + m).
// - Therefore, the total space complexity is O(n + m).
