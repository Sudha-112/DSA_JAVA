package Hashing;
import java.util.HashMap;

public class FrequencyCounter {

    public static void main(String[] args){

        int [] arr = {1,1,2,1,1,2,5};

        HashMap<Integer,Integer> map = new HashMap<>();

        int maxFreq = 0, minFreq = arr.length, maxEle = 0, minEle =0;

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }

        for(int key : map.keySet()){
            int element = key;
            int count = map.get(key);


            if(count > maxFreq){
                maxFreq = count;
                maxEle = element;
            }

            if(count < minFreq){
                minFreq = count;
                minEle = element;
            }

        }

        // Print results
        System.out.println("The highest frequency element is: " + maxEle + " with frequency " + maxFreq);
        System.out.println("The lowest frequency element is: " + minEle + " with min frequency " + minFreq);
    }
}
