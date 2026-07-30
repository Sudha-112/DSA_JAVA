package String.Anagram;

public class bruteForce {

    public static boolean anagramCheck(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Case 2: check if every character of str1 and str2 matches with each other
        for (int i = 0; i < str1.length(); i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;  // If any character doesn't match, they aren't anagrams
            }
        }

        return true;  // Strings are anagrams
    }


    public static void main(String [] args){

        String str1 = "INTEGER";
        String str2 = "TEGERNI";

        boolean ans = anagramCheck(str1, str2);
        System.out.println(ans);
    }

}


//Time complexity = O(NLOGN)
// Space complexity = O(N)