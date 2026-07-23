package BasicMath;

public class ReverseDigits {

    public static int rev(int n) {
       int lastDigit;
       int revNum = 0;
       while(n>0) {
           lastDigit = n % 10;
           revNum = revNum * 10 + lastDigit;
           n = n / 10;
       }
       return revNum;
    }

    public static void main(String[] args){
        int n = 34522;
        int revNum =  rev(n);
        System.out.println("Reverse of " + n + " is " + revNum);
    }
}
