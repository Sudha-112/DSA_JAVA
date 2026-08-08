package Arrayss.MajorityElements.MajorityElementsII;

import java.util.HashSet;

public class bruteforce {

    public static void majorityEle(int[] nums) {


        int n = nums.length;
        int times = n / 3;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int element = nums[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (element == nums[j]) {
                    count++;
                }
            }

            if (count > times) {
               set.add(element);
            }

            if(set.size() == 2){
                break;
            }
        }

        for(int num : set){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args){

        int[] arr = {1,2,1,1,3,2};

        majorityEle(arr);

    }
}

//time complexity = O(n^2)
// space complexity = O(1)