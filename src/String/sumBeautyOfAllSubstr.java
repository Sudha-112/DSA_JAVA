package String;

import java.util.HashMap;

public class sumBeautyOfAllSubstr {

    public static int sumBeauty(String s){

        int n = s.length();
        int sum = 0;

        for(int i = 0; i  < n; i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j = i; j < n; j++){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0) + 1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for(int value : map.values()){
                    max = Math.max(max,value);
                    min = Math.min(min, value);
                }

                sum+= max - min;
            }
        }
        return sum;
    }


    public static void main(String[] args){

        String s = "xyx";

        int ans = sumBeauty(s);
        System.out.println(ans);
    }
}

//time complexity = O(n^2)
//space complexity = O(1)   if characters are only alphabets (lowercase/uppercase(26))
