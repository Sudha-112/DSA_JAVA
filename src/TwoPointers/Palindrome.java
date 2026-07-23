package TwoPointers;

public class Palindrome {

    public static void main(String[] args){

        String str = "madam";
        str = str.toLowerCase().replaceAll("[^a-z0-9]","");
        //two pointer method
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while(start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome){
        System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }


    }
}
