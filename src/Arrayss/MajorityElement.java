package Arrayss;

import java.util.HashMap;

public class MajorityElement {

    public static void majorityEle(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int maxCount = 0;
        int majEle = 0;
        for(int key : map.keySet()) {
            int element = key;
            int count = map.get(key);

            if(count >  maxCount){
                maxCount = count;
            }

            if(map.get(element) >= maxCount){
                majEle = element;
            }

        }
        System.out.println("The majority element is " + majEle + " appearing " + maxCount + " times.");
    }

    public static void main(String[] args) {


        int[] arr = {7,0,0,1,7,7,2,7,7};
        majorityEle(arr);
    }
}

//time complexity = O(n)
//space complexity = O(1)