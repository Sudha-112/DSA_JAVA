package Sorting;

public class RecursiveBubbleSort {

    public static void bubbleSort(int[] arr, int n){
        //base case: array of size 1 is already sorted
        if(n == 1){
            return;
        }

         int swap = 0;
        //push the largest element in the end
        for(int i = 0; i <= n-2; i++){
            if(arr[i] > arr[i+1]){

                //swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap++;
            }
        }

        if(swap == 0){
            return;
        }
        //recurse for the remaining unsorted array
        bubbleSort(arr, n-1);
    }

    public static void main(String[]args){
        int[] arr = {2,4,1,6,3};
        int n = arr.length;

        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(arr,n);

        for(int num: arr){
            System.out.print(num + " ");
        }

    }


}
