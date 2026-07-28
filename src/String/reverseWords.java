package String;

import java.util.Arrays;

public class reverseWords {

    public static void reverseString(String s){

        String[] str = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = str.length-1; i >= 0; i--){
            result.append(str[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args){

        String s = "coding at good are you";

        reverseString(s);
    }
}

//time complexity = O(N)
//space complexity = O(n) [str array] + O(n) [StringBuilder] = O(n)
