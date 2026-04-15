class InsertionSort{
    void sort(int [] arr){
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}

public class Main{
    public static void main(String[] args){
        int[] arr = {4,1,3,9,7};
        InsertionSort insertionsort = new InsertionSort();
        System.out.println("Before insertion sort: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        insertionsort.sort(arr);

        System.out.println("After insertion sort: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}