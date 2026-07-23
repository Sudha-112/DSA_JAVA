package Hashing;
import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 30};

        HashMap<Integer, Integer> map = new HashMap<>();


        //store frequency
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
            //print frequency
            for (int key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }


