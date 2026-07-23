package Arrayss;

import java.util.Arrays;

public class AlternateSigns {

    public static void alternateSigns(int[] nums){


         int []result = new int[nums.length];
         int pos = 0;
         int neg = 1;
         for(int i = 0; i < nums.length; i++){
             if(nums[i]>=0){
                 result[pos] = nums[i];
                 pos+=2;
             }else{
                 result[neg]=nums[i];
                 neg+=2;
             }
         }


         System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args){

        int[] arr = {1,2,-3,-1,-2,3};
        alternateSigns(arr);
    }
}
