package Arrayss;

public class LongestSubArraySum {

    public static int longestSubArrSum(int[] arr, int target){

        int maxLength = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            int length = 0;

         for(int j = i; j < arr.length; j++){

             sum = sum + arr[j];
             length++;
             if(sum == target){
                 if(length > maxLength){
                     maxLength = length;
                 }

             }

         }                        
     }
        return maxLength;
    }

    public static void main(String[] args){

        int[] arr = {10,5,2,7,1,9};
        int k = 15;

        int ans =longestSubArrSum(arr,k);
        System.out.println("The longest subarray with the sum "+ k + " is " + ans);
    }

}
