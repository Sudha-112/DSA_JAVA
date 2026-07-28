package String.sortByCharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class optimalApp {

    public static char[] sort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> uniqueChars = new ArrayList<>(map.keySet());

        uniqueChars.sort((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);

            if (freqA != freqB) {
                return freqB - freqA;  // descending order according to frequency of character
            }
            return a - b; //ascending order of characters
        });

        char[] result = new char[uniqueChars.size()];

        for(int i = 0; i < uniqueChars.size(); i++){
            result[i] = uniqueChars.get(i);
        }
       return result;

    }

    public static void main(String[] args){

        String s = "";
        char[] ans = sort(s);
        System.out.println(Arrays.toString(ans));
    }
}
// time complexity = O(n + klogk)
// space complexity = O(k)