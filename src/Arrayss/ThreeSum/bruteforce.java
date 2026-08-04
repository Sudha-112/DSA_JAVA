package Arrayss.ThreeSum;

import java.util.*;

public class bruteforce {

    public static List<List<Integer>> findTriplets(int[] nums){

        int n = nums.length;

        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){

                    List<Integer> triplet = Arrays.asList(nums[i] , nums[j], nums[k]);
                    set.add(triplet);

                    }
                }
            }
        }

        list.addAll(set);
        return list;
    }

   public static void main(String[] args){

       int[] arr = {-1,0,1,2,-1,-4};
      List<List<Integer>> ans =  findTriplets(arr);
      System.out.println(ans);
   }

}

//time complexity = O(n^3 + nlogn)
// space complexity = O(no.of unique triplets * 2)
