package BinarySearch;

import java.util.Arrays;

public class floorCeil {

    public static int[] findFC(int[] nums, int key){

        int si1 = 0;
        int ei1= nums.length-1;
        int si2 = 0;
        int ei2= nums.length-1;

        int[] arr = new int[2];
        int ceil = -1;
        int floor = -1;
        while(si1 <= ei1 && si2 <= ei2){

            int mid1 = si1 + (ei1-si1)/2;

            //find ceil
            if(nums[mid1] >= key){
                ceil = nums[mid1];
                ei1 = mid1 - 1;
            }else {
                si1 = mid1 + 1;
            }

            //find floor

            int mid2 = si2 + (ei2 - si2)/2;
            if(nums[mid2] <= key){
                floor = nums[mid2];
                si2 = mid2 + 1;

            }else{
                ei2 = mid2 - 1;
            }
        }

        arr[0] = ceil;
        arr[1] = floor;

        return arr;

    }


    public static void main(String[] args){

        int[] arr = {1,2,3,4,7,8};
        int key = 6;

        int[]result = findFC(arr, key);
        System.out.println(Arrays.toString(result));
    }
}

//time complexity = O(logn)
//space complexity = O(1)