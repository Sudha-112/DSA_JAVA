package Sorting;

public class InsertionSort {

    public static void insertionSort(int [] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            //finding out the correct position to insert

            while (prev >= 0 && arr[prev] > curr) {

                arr[prev + 1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev + 1] = curr;

        }

        System.out.print("The sorted array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {1,5,4,9,3,2};

        System.out.print("The given array is : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        insertionSort(arr);
    }
}
