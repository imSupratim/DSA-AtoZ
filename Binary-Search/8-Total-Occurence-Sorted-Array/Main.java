import java.util.*;

class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int low = 0, high = arr.length-1;
        int firstIndex = -1;
        int lastIndex = -1;
        
        //find first 
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                firstIndex = mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        if(firstIndex == -1){
            return 0;
        }
        
        low = 0;
        high=arr.length-1;
        
        //find last 
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                lastIndex = mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return (lastIndex-firstIndex+1);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6};
        int target = 5;
        int result = sol.countFreq(arr, target);
        System.out.println("Total Occurrence: " + result); // Output: Total Occurrence: 3
    }
}