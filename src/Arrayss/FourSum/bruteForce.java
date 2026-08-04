package Arrayss.FourSum;

import java.util.*;

public class bruteForce {

    public static List<List<Integer>> findQuadruplets(int[] nums){

        int n = nums.length;

        Set<List<Integer>> resultSet = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k =j+1; k < n; k++){
                    for(int l = k+1; l < n; l++){
                        if(nums[i] + nums[j] + nums[k] + nums[l] == 0){
                            resultSet.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        }
                    }
                }
            }
        }

        list.addAll(resultSet);
        return list;

    }

    public static void main(String[] args){

        int [] arr = {1,0,-1,0,-2,2};
        List<List<Integer>> ans = findQuadruplets(arr);
        System.out.println(ans);
    }
}

//time complexity = O(n^4)
//space complexity = O(2* no. of unique quadruplets)
