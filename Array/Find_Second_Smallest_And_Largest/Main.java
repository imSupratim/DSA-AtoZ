class Solution{
    static int getSecondSmallest(int[] arr, int n){
        if(n<2){
            return -1;
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]<small){
                second_small = small;
                small = arr[i];
            }
            else if(arr[i]<second_small && arr[i]!=small){
                second_small = arr[i];
            }
        }

        return second_small;
    }


    static int getSecondLargest(int[] arr,int n){
        if(n<2){
            return -1;
        }

        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>large){
                second_large=large;
                large=arr[i];
            }
            else if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
        }

        return second_large;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {12,54,23,76,24,68,8};
        int n = arr.length;
        System.out.println("Second smallest value is: "+ Solution.getSecondSmallest(arr, n));
        System.out.println("Second largest value is: "+ Solution.getSecondLargest(arr, n));
    }
}
