package Arrayss;

public class CountSumSubArray {

    public static int Count(int[] nums, int target){

        int count = 0;
        for(int i = 0; i < nums.length; i++){
              int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum+=nums[j];
                if(sum == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3};
        int sum = 3;

        int ans = Count(arr,sum);
        System.out.println(ans);
    }
}
