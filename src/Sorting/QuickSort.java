package Sorting;

public class QuickSort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;  //pivot index
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pvtidx = partition(arr, low, high);

            quickSort(arr, low, pvtidx - 1);
            quickSort(arr, pvtidx + 1, high);

        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        quickSort(arr, 0, n - 1);

        //print
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}

//time complexity
// worst case complexity = O(n^2)
//average case complexity = O(nlogn)