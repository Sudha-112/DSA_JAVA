package Arrayss.ThreeSum;

import java.util.*;

public class betterApp {

    public static List<List<Integer>> findTriplets(int[] nums){

        int n = nums.length;

        Set<List<Integer>> resultSet = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i+1; j < n; j++){
               int third = -(nums[i] + nums[j]);
                    if(set.contains(third)) {

                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                        Collections.sort(triplet);
                        resultSet.add(triplet);
                    }else{
                        set.add(nums[j]);
                    }
            }
        }

        list.addAll(resultSet);
        return list;
    }

    public static void main(String[] args){

        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans =  findTriplets(arr);
        System.out.println(ans);
    }
}

//time complexity = O(n^2 * log(no. of unique triplets))
// space complexity = O(2 * no .of unique triplets) + O(n)