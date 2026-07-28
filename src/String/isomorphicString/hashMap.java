package String.isomorphicString;

import java.util.HashMap;

public class hashMap {

    public static boolean isomorphicCheck(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original, replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedCharacter = map.get(original);
                if(mappedCharacter != replacement){
                    return false;
                }
            }

        }

        return true;

    }

    public static void main(String [] args){

        String s = "egg";
        String t = "odd";

        boolean ans = isomorphicCheck(s,t);
        System.out.println(ans);
    }

}

//time complexity = O(n^2)
// space complexity = O(n)