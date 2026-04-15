import java.util.*;

class Solution{
    public static int longestSubarray(int[] arr, int k){
        // int n = arr.length;
        // int maxLen = 0;

        // for(int startIndex = 0; startIndex<n; startIndex++){
        //     for(int endIndex = startIndex ; endIndex<n; endIndex++){
        //         int currentSum = 0;

        //         for(int i = startIndex; i<=endIndex; i++){
        //             currentSum+=arr[i];
        //         }

        //         if(currentSum == k){
        //             maxLen = Math.max( maxLen, endIndex-startIndex+1);
        //         }
        //     }
        // }

        // return maxLen;

        int left = 0, sum = 0, maxLen = 0;
        int n = arr.length;

        for (int right = 0; right < n; right++) {
            sum += arr[right]; // expand window

            // shrink window if sum > k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // check if sum == k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

        }

        return maxLen;

        //only works for non negative array elements
            
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0 ; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the sum value K: ");
        int k = sc.nextInt();

        int result = Solution.longestSubarray(arr, k);
        System.out.println("Length of longest subarray is: "+result);

        sc.close();
    }
}