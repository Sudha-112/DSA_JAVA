package Sorting;

//when the array is already sorted
//bestCase time complexity : O(n)  not O(n^2)
public class bestcaseBubbleSort {

    public static void BBubbleSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i <= n-2; i++){

            int swap = 0;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }

            if(swap == 0){
                break;
            }
        }

        System.out.print("The sorted array is : ");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }



    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,8};

        System.out.print("The given array is: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();

        BBubbleSort(arr);
    }
}
