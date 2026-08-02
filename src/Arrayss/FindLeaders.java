package Arrayss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLeaders {

    public static List<Integer> Leaders(int[] nums){

        List <Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int n = nums.length;



        for(int i = n-1; i >= 0; i--){
            if(nums[i] > max){
                list.add(nums[i]);
                max = nums[i];
            }
        }
       list.reversed();
        return list;



    }

    public static void main(String[] args){

        int[] arr = {10,2,3,4,1,0,5};

        List<Integer> ans = Leaders(arr);
        System.out.println(ans);
    }

}
