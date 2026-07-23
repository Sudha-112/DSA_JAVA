package Sorting;

public class RecursiveInsertionSort {

    public static void insertionSort(int[] arr, int i, int n) {
        //base case
        if (i == n) {
            return;
        }

        int j = i;
        //move the current element back until it's in the correct position

        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        //recurse for the next index
        insertionSort(arr, i + 1, n);
    }


    public static void main(String[] args) {
        int[] arr = {13, 15, 10, 2, 4, 7};
        int n = arr.length;

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        insertionSort(arr, 0, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
