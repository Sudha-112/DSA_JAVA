package String.isomorphicString;

public class arraySol {

    public static boolean isomorphicCheck(String s, String t) {

        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();

        if(s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < n; i++) {

            if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
                return false;
            }

            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }



    public static void main(String[] args){


        String s = "egg";
        String t = "odd0000000";

        boolean ans = isomorphicCheck(s,t);
        System.out.println(ans);
    }

}

//time complexity = O(n)
// space complexity = O(1)