import java.util.*;

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int low = 0, high = arr.length-1;
        int left = -1, right = -1;
        
        // find left most
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid] == x){
                left = mid;
                high = mid-1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        low = 0;
        high = arr.length-1;
        
        // find right most
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid] == x){
                right = mid;
                low = mid+1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        list.add(left);
        list.add(right);
        return list;
        
        
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6};
        int x = 5;
        ArrayList<Integer> result = sol.find(arr, x);
        System.out.println("First and Last Occurrence: " + result); // Output: First and Last Occurrence: [5, 7]
    }
}