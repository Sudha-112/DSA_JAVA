package Arrayss.mergeTwoSortedArrays;

import java.util.Arrays;

public class optimalApp {


        public static void merge(int[] nums1, int[] nums2){

            int n = nums1.length;
            int m = nums2.length;
            int i = n-1;   // nums1
            int j = 0;   // nums2


            while(i >= 0 && j < m){
                if(nums1[i] > nums2[j]){
                    int temp = nums2[j];
                    nums2[j] = nums1[i];
                    nums1[i] = temp;
                    i--;
                    j++;

                }else{
                    break;
                }
            }

            Arrays.sort(nums1);
            Arrays.sort(nums2);

        }

        public static void main(String[] args){
            int[] nums1 = {1,3,5,7};
            int[] nums2 = {0,2,6,8,9};

            merge(nums1, nums2);
            System.out.println(Arrays.toString(nums1));
            System.out.println(Arrays.toString(nums2));
        }
    }

//time complexity = O(min(m,n)) + O(n*logn) + O (m*logm)
// space complexity = O(1)



