package Sorting;

public class SelectionSort {

    //function to perform selection sort
    public static void selectionSort(int[] arr){
        int n = arr.length;

        //Traverse through all the elements
        for(int i = 0; i < n-1; i++){
            int minIndex = i; //Assume the current index hold the minimum value

            //Find the minimum element in the remaining array
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j; //update the minIndex if smaller is found
                }
            }

            //swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        //print the sorted array

        System.out.print("The sorted array after the selection sort is applied: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args){
        int[] arr = {3,2,1,8,4,70,22};

        //print the array before sorting
        System.out.print("The unsorted array : ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

        //call selection sort
        selectionSort(arr);
    }
}
