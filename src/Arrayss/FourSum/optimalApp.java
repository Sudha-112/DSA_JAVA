package Arrayss.FourSum;

import java.util.*;

public class optimalApp {


    public static List<List<Integer>> findQuadruplets(int[] nums, int target){

        int n = nums.length;

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){

                if(i > 0 && nums[i] == nums[i-1]) continue;
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int k = j+1;
                int l = n-1;

                while(k<l){

                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target){
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;

                    }else if (sum > target){
                        l--;
                    }else{
                        k++;
                    }
                }
            }
        }

    return list;
    }

    public static void main(String[] args){

        int [] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = findQuadruplets(arr,target);
        System.out.println(ans);
    }
}


// time complexity = O(n^3)
// space complexity = O(1)