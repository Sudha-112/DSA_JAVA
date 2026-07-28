package String.Anagram;

public class optimalApp {

    public static boolean anagramCheck(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        int[] freq = new int[26];
        // Count frequency of each character in str1
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'A']++;  // Increment frequency for each character in str1
        }

        // Decrement frequency for each character in str2
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'A']--;  // Decrement frequency for each character in str2
        }

        // Check if all frequencies are zero, meaning both strings have the same characters
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)  // If any frequency is non-zero, they are not anagrams
                return false;
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

// time complexity = O(n)
// space complexity = O(1)
