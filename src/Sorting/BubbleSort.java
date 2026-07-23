package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
         int n = arr.length;

        for(int turn = 0; turn <= n-2 ; turn++){
            for(int j = 0; j< n-turn-1 ; j++){
                if(arr[j] > arr[j+1]){
                    //swap

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        System.out.print("The sorted array using bubble sort: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args){
        int[] arr = {3,6,99,2,34,76,23};

        System.out.print("The unsorted array: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        bubbleSort(arr);
    }


}
