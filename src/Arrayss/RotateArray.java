package Arrayss;

import java.util.Arrays;

public class RotateArray {

    public static void reverseArray(int[] arr, int si, int ei){

        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }


    }

    public static void leftRotateArray(int[]num, int b){

        int n = num.length;
        b = b % n;

        reverseArray(num,0,b-1);
        reverseArray(num,b,n-1);
        reverseArray(num,0,n-1);

        System.out.println(Arrays.toString(num));

    }

    public static void rightRotateArray(int[]nums, int a) {

        int n = nums.length;
        a = a % n;

        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, a - 1);
        reverseArray(nums, a, n - 1);

        System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int k = 2;

        leftRotateArray(arr1,k);
        rightRotateArray(arr2,k);
    }
}
