package String;

import java.util.Arrays;

public class longestCommonPrefix {

    public static String longCommonPrefix(String[] strs){

        if(strs.length == 0 || strs == null){
            return "0";
        }

        String first = strs[0];

        int n = first.length();
        for(int i = 0; i < n; i++){
            for(int j = 1; j < strs.length; j++){
                String word = strs[j];
                if(i == word.length() || first.charAt(i)!=word.charAt(i)){
                    return first.substring(0,i);
                }
            }
        }
        return first;

    }

    public static void main(String[] args) {

        String[] s = {"flower", "flow", "flight"};

        String result = longCommonPrefix(s);
        System.out.println(result);
    }
}


//time complexity = O(n*m)
//space complexity = O(1)