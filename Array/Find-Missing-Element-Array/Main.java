class Solution {
    static int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        long totalNum = n+1;
        long predictiveSum = (totalNum*(totalNum+1))/2;
        long actualSum = 0;
        for(int nums: arr){
            actualSum+=nums;
        }
        
        return (int)(predictiveSum-actualSum);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        int result = Solution.missingNum(arr);
        System.out.println("The missing element is: "+result);
    }
}
