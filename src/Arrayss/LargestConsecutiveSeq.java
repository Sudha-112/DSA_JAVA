package Arrayss;
//do by using hashset

import java.util.Arrays;

public class LargestConsecutiveSeq {

    public static int largestSeq(int[] nums) {

        int maxCount = 1;
        int count = 1;

        if(nums.length == 0) return 0;
      for(int i = 0; i < nums.length-1; i++){

          if(nums[i] == nums[i+1]){
              continue;
          }
          if(nums[i] + 1 == nums[i+1]){
              count++;
              maxCount = Math.max(count, maxCount);
          }
          else{
              maxCount = Math.max(maxCount,count);
              count = 1;
          }
      }
      return Math.max(maxCount, count);

        }


    public static void main(String[] args){

        int[] arr = {0,3,7,2,5,8,4,6,0,1};

        Arrays.sort(arr);

        int ans = largestSeq(arr);
        System.out.println(ans);
    }
}
