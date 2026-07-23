package Arrayss;

public class kadanesAlgo {


    public static void kadane(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {

            if (sum == 0) {
                start = i;
            }

            sum = sum + nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println("The maxSum is : " + maxSum);
        System.out.print("The maxSum subarray is : ");
        for(int i = start; i <= end; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
    }
}