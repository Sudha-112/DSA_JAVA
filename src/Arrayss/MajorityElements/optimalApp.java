package Arrayss.MajorityElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class optimalApp {

    public static List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int times  = (int) Math.floor(n/3);

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(entry.getValue() > times){
                list.add(entry.getKey());
            }

            if(list.size() == 2){
                break;
            }
        }

        return list;
    }

    public static void main(String[] args){
        int[] arr = {2,1,1,3,1,4,5,6};

        List<Integer> result = majorityElement(arr);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}

//time complexity = O(n)
// space complexity = O(n)