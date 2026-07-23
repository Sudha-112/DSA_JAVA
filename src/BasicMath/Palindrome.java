package BasicMath;

public class Palindrome {

    public static int isPalindrome(int n){
         int a = n;
         int lastDigit;
         int revNum = 0;

         while(n>0){
             lastDigit = n%10;
             revNum = revNum * 10 + lastDigit;
             n = n/10;

         }
         return revNum;

    }

    public static void main(String[] args){
        int n = 455;
        int revNum = isPalindrome(n);
        if(n == revNum) {
            System.out.println("The reverse of the "+ n + " is "+ revNum + " and therefore it is a palindrome.");
        }
        else
            System.out.println("The reverse of the "+ n + " is "+ revNum + " and therefore it is not a palindrome.");
    }
}
