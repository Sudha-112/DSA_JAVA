package Arrayss.nextPermutation;

// brute force is
/*
  1. generate all sorted permutations
  2. apply linear search to find the given permutation
  3. return the next index permutation
   The time complexity is very high using this = O(n!*n)
 */

// optimal Approach

/* 1. find the longest prefix match  a[i] < a[i+1]  breakpoint index = i
   2. find > a[i] , but the smallest one so that you can stay close
   3. try to place left array in the sorted manner
 */

public class optimalApp {

    public static void reverse(int[] arr, int si, int ei){

        while(si< ei){
            int temp;
            temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static int[] nextPermutation(int[] arr){

        int n = arr.length;
        int index = -1;

        // finding the breakpoint and storing the index
        for(int i = n-2; i >= 0 ; i--){
            if(arr[i] < arr[i+1]){
                index = i;   // breakpoint
                break;
            }
        }

        // if there is no breakpoint
        if(index == -1){
            reverse(arr, 0, n-1);
            return arr;
        }

        // swap the numbers
        for(int i = n-1; i >= index; i--){
            if(arr[index] < arr[i]){  // number greater than and close to arr[index]
                int temp;
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        reverse(arr, index+1, n-1);

       return arr;

    }

    public static void main(String[] args){

        int[] arr = {1,3,2};

        int[] res = nextPermutation(arr);
        System.out.print("The next permutation is : ");
        for(int num: res){
            System.out.print(num + " ");
        }
    }

}
