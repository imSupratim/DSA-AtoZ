// Basic Binary search
// return -1 if not found and if multiple occurrence return the smallest index of the element

class Solution {
    public static int binarysearch(int[] arr, int k) {
        // Code Here
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] > k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return -1;
        
        
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 5;
        int index = Solution.binarysearch(arr, k);
        if(index != -1){
            System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("Element not found in the array.");
        }
    }
}