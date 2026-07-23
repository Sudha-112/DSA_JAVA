package BasicMath;

public class ArmstrongNum {

    public static int CountDigits(int n){

        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }


    public static int isArmstrong(int n){
        int num = 0;
        int lastDigit;
        int power = CountDigits(n); //power = no. of digits
        while(n>0){
           lastDigit  = n%10;
            num = num + (int)Math.pow(lastDigit, power);
            n = n/10;
        }
        return num;
    }


    public static void main(String[] args){
        int n = 9474;
        int num =  isArmstrong(n);
        if(n == num){
            System.out.println("The number "+ n + " is a armstrong number");
        }else
            System.out.println("The number " + n + " is not a armstrong number");
    }
}
