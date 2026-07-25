package String.rotateString;

public class optimalApp {

    public static boolean rotate(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        String Concat = s+s;
        return Concat.contains(t);
    }

    public static void main(String [] args){
        String s = "rotation";
        String t = "tionrota";

        boolean ans = rotate(s,t);
        System.out.println(ans);
    }
}

//Time complexity = O(N)
//Space complexity = O(N)
