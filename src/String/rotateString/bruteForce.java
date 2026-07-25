package String.rotateString;

public class bruteForce {

    public static boolean rotate(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            String rotated = s.substring(i) + s.substring(0,i);
            if(rotated.equals(t)){
                return true;
            }

        }
        return false;
    }

    public  static void main(String [] args){

        String s = "rotation";
        String t = "tionrota";

        boolean ans = rotate(s,t);
        System.out.println(ans);
    }
}


//Time complexity = O(n^2)
// space complexity = O(n)