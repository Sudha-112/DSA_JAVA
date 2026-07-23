package Arrayss;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZerosToEnd(int[] arr){

        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!= 0){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};

        moveZerosToEnd(arr);

        System.out.println(Arrays.toString(arr));
    }
}