package Arrayss;

import java.util.Arrays;

public class Union {

    // union of two sorted arrays

   public static void union(int[] arr1, int[] arr2){

       int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length){

//            remove duplicate elements
            if(i>0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }

            if(j>0 && arr2[j] == arr2[j-1]){
                j++;
                continue;
            }

            if(arr1[i] == arr2[j]){

                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                System.out.print(arr1[i]+ " ");
                i++;
            }else{
                System.out.print(arr2[j] + " ");
                j++;
            }

        }

        while(i<arr1.length){
            if(arr1[i] != arr1[i-1]){
                System.out.print(arr1[i]+" ");
            }
            i++;
        }

       while(j<arr2.length){
           if(arr2[j] != arr2[j-1]){
               System.out.print(arr2[j]+" ");
           }
           j++;
       }

   }

    public static void main(String[] args){

        int[] arr1 = {1,3,4,5};
        int[] arr2 = {2,3,5,5,6,7,8};

         union(arr1,arr2);

    }
}
