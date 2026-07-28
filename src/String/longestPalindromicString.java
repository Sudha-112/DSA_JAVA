package String;

public class longestPalindromicString {

    public static String longPalString(String s){

                if (s == null || s.length() == 0) return "0";

                int start = 0, end = 0;

                for (int i = 0; i < s.length(); i++) {
                    // Odd length palindrome (center = i)
                    int len1 = expandAroundCenter(s, i, i);
                    // Even length palindrome (center = i, i+1)
                    int len2 = expandAroundCenter(s, i, i + 1);

                    int maxLen = Math.max(len1, len2);

                    // Agar naya lamba palindrome mila, to start/end update karo
                    if (maxLen > end - start + 1) {
                        start = i - (maxLen - 1) / 2;
                        end = i + maxLen / 2;
                    }
                }

                return s.substring(start, end + 1);
            }

            // Center se bahar ki taraf expand karo jab tak palindrome match ho
            private static int expandAroundCenter(String s, int left, int right) {
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                }
                return right - left - 1;   // palindrome ki length
            }




    public static void main(String[] args){
        String s = "bababd";

        String ans = longPalString(s);
        System.out.println(ans);
    }
}


//time complexity = O(n^2)
// space complexity = O(1)