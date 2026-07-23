package Arrayss;

import java.util.Arrays;

public class SortArray012 {

    public static void sort(int[] arr){

              int n = arr.length;

              for(int i = 1; i < n; i++){
                  int curr = arr[i];
                  int prev = i-1;

                  while(prev >= 0 && arr[prev] > curr){
                      arr[prev+1] = arr[prev];
                      prev--;
                  }
                  arr[prev+1] = curr;
              }

              System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){

        int[] arr = {1,0,1,2,0};

        sort(arr);
    }

}
