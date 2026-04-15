import java.util.*;

class Solution {
    static int lowerBound(int[] arr, int target) {
        // code here
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if( arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 11;
        int index = Solution.lowerBound(arr, target);
        if(index != arr.length){
            System.out.println("Lower bound of "+target+" is at index: "+index);
        }
        else{
            System.out.println("Lower bound of "+target+" does not exist in the array.");
        }
    }
}
