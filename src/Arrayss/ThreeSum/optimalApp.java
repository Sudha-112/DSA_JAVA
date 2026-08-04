package Arrayss.ThreeSum;

import java.util.*;

public class optimalApp {


    public static List<List<Integer>> findTriplets(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // Step 1: Array sort karo - two pointer ke liye zaroori hai
        Arrays.sort(nums);

        // Step 2: 'i' ko fix karo, baaki do numbers two-pointer se dhoondo
        for (int i = 0; i < n - 2; i++) {

            // Agar sabse chhota number hi 0 se bada hai, to sum kabhi 0 nahi hoga
            // (kyunki array sorted hai, aage sab values aur badi hongi)
            if (nums[i] > 0) break;

            // Duplicate 'i' skip karo
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;       // left pointer
            int k = n - 1;       // right pointer

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    // Triplet mil gaya
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    // Duplicate 'j' skip karo
                    while (j < k && nums[j] == nums[j - 1]) j++;

                    // Duplicate 'k' skip karo
                    while (j < k && nums[k] == nums[k + 1]) k--;

                } else if (sum < 0) {
                    j++;   // sum badhana hai, chhoti value ko aage badhao
                } else {
                    k--;   // sum ghatana hai, badi value ko peeche lao
                }
            }
        }

        return result;
    }



    public static void main(String[] args){

        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans =  findTriplets(arr);
        System.out.println(ans);
    }
}


//time complexity = O(n^2)
// space complexity = O(1)