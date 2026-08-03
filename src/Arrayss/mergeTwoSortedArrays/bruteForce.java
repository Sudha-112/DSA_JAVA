package Arrayss.mergeTwoSortedArrays;

import java.util.Arrays;

public class bruteForce {

    public static void merge(int[] nums1, int[] nums2){

        int n = nums1.length;
        int m = nums2.length;
        int[] nums3 = new int[n+m];
        int i = 0;
        int j = 0;
        int index = 0;

        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                nums3[index] = nums1[i];
                i++;
                index++;
            }else{
                nums3[index] = nums2[j];
                j++;
                index++;
            }
        }

        while(i < n){
            nums3[index] = nums1[i];
            i++;
            index++;
        }

        while(j < m){
            nums3[index++] = nums2[j++];
        }

        for(int k = 0; k < n+m; k++){
            if(k < n){
                nums1[k] = nums3[k];
            }else{
                nums2[k-n] = nums3[k];
            }
        }

    }

    public static void main(String[] args){
        int[] nums1 = {1,3,5,7};
        int[] nums2 = {0,2,6,8,9};

          merge(nums1, nums2);
         System.out.println(Arrays.toString(nums1));
         System.out.println(Arrays.toString(nums2));
    }
}

//time complexity = O(n+m)
// space complexity = O(n+m)
