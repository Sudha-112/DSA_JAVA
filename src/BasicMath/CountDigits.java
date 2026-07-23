package BasicMath;
import java.util.*;
import java.util.Scanner;

class Count{
    public void count(int n){
        int a = n;
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }

        System.out.println("The number " + a + " has " + count + " digits ");
    }
}


public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Count obj = new Count();
        obj.count(n);
    }
}
