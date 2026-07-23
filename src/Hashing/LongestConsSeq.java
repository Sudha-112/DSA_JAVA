package Hashing;

import java.util.HashSet;

public class LongestConsSeq {

    public static int longest(int[] nums){

        int maxCount = 0;

        HashSet<Integer> Set = new HashSet<>();
        for(int num : nums){
            Set.add(num);
        }

        for(int num : Set){
            if(!Set.contains(num-1)){
                int current = num;
                int count = 1;
                while(Set.contains(current+1)){
                    current++;
                    count++;
                }
                maxCount = Math.max(count,maxCount);
            }
        }

        return maxCount;
    }

    public static void main(String[] args){

        int[] arr = {1,100,2,3,4,200};
        int ans = longest(arr);
        System.out.println(ans);
    }
}
