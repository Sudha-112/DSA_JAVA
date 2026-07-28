package String;

public class maxNestedDepth {

    public static int maxDepth(String s) {

        int max = 0;
        int level = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                level++;
            }

            if (s.charAt(i) == ')') {

                max = Math.max(max, level);
                level--;
            }

        }
       return max;
    }

    public static void main(String[] args){

        String s = "2+((#))+(9)+(((0)))";

        int ans  = maxDepth(s);
        System.out.println(ans);
    }
}
//time complexity = O(N)
//space complexity = O(1)