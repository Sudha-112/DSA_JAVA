package Arrayss;

public class ArraySorted {

    public static Boolean isArraySorted(int[] arr){

        int n  = arr.length;
        Boolean isSorted = true;
        for(int i = 0; i < n-1; i++){

            if(arr[i]>arr[i+1]){
                isSorted = false;
            }
        }
        return isSorted;
    }

    public static void main(String[]args){

        int[]arr = {1,2,3,4,5};

         Boolean ans = isArraySorted(arr);
         System.out.println(ans);
    }
}
