package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

    public static int missingNumber(int[] arr, int n){

        int Expected_Sum = (n*(n+1))/2;
        int Actual_Sum = 0;
    ;
    for(int i = 0 ; i <arr.length; i++){
        Actual_Sum+=arr[i];
    }

    return Expected_Sum - Actual_Sum;

    }


    public static void main(String[] args){

       int[] arr = {1,3,5,4,6,2,8};
       int n = 8;

       int ans = missingNumber(arr,n);
       System.out.println(ans);


    }
}
