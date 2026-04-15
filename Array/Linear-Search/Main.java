class Solution{
    public static int LinearSearch(int[] arr, int target){
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 4;
        int result = Solution.LinearSearch(arr, target);
        if(result==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index number: "+result);
        }
    }
}
