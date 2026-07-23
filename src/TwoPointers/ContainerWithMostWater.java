package TwoPointers;

public class ContainerWithMostWater {

    public static int MaxArea(int[] arr){

        int n  = arr.length;
        int left = 0;
        int right = n-1;
        int maxArea = Integer.MIN_VALUE;

        while(left < right){

            int currArea;
            currArea = Math.min(arr[left] , arr[right]) * (right - left);

            if(currArea > maxArea){
                maxArea = currArea;
            }


            if(arr[left] > arr[right]){
                right--;
            }

            else if(arr[right] > arr[left]){
                left++;
            }
            else{
                left++;
            }
        }
       return maxArea;

    }

    public static void main(String[] args){

        int[] height = {1,8,6,2,5,4,8,3,1};
        int maxArea = MaxArea(height);
        System.out.println(maxArea);

    }


}
