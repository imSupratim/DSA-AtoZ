class Solution{
    int findMinIndex(int[] arr, int start, int end){
        int minIndex = start;
        for(int i = start+1; i<=end; i++){
            if(arr[minIndex]>arr[i]){
                minIndex = i;
            }
        }

        return minIndex;
    }

    void selectionSort(int[] arr){
        int n = arr.length;
        for(int i =0 ; i<=n-2; i++){
            int minIndex = findMinIndex(arr, i, n-1);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
}

public class Main{
    public static void main(String[] args){
        int[] nums = {4,1,3,9,7};
        Solution sol = new Solution();
        sol.selectionSort(nums);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        
    }
}

// time comp: O(n)