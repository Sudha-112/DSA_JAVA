package String.sortByCharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bruteForce {

    public static char[] sort(String s){

        List<Character> uniqueChar = new ArrayList<>();

        for(char ch : s.toCharArray()){
            if(!uniqueChar.contains(ch)){
                uniqueChar.add(ch);
            }
        }

        int n = uniqueChar.size();
        char[] chars = new char[n];
        int[] counts = new int[n];

        for(int i = 0; i < n; i++){
            char c = uniqueChar.get(i);
            int count = 0;
             for(char ch : s.toCharArray()){
                 if(ch == c){
                     count++;
                 }
             }
             chars[i] = c;
             counts[i] = count;

        }


        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){

                if(counts[j] > counts[i] || counts[i] == counts[j]  && chars[j] < chars[i]){
                    //swap counts
                    int tempCount = counts[j];
                    counts[j] = counts[i];
                    counts[i] = tempCount;

                    //swap Chars

                    char tempChar = chars[j];
                    chars[j] = chars[i];
                    chars[i] = tempChar;
                }
            }
        }
        return chars;

    }


    public static void main(String[] args){

        String s = "tree";
        char[] ans = sort(s);
        System.out.println(Arrays.toString(ans));

    }
}
