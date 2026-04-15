// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int low = 0, high = arr.length-1;
        int ans = -1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] >= x ){
                ans = mid;
                high = mid-1;
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
        Solution sol = new Solution();
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        int result = sol.findCeil(arr, x);
        System.out.println("Ceil index: " + result); // Output: Ceil index: 2
    }
}