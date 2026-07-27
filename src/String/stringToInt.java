package String;

public class stringToInt {

    public static int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        // Step 1: Leading whitespace skip karo
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) return 0;   // sirf spaces the ya empty string

        // Step 2: Sign check karo (SIRF EK BAAR, current position pe)
        int sign = 1;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;   // sign wale character ko aage badhao
        }

        // Step 3: Ab digits padho (yeh alag loop hai, sign check se independent)
        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args){
        String s = "     -1234";
        int ans = myAtoi(s);
        System.out.println(ans);
    }
}
