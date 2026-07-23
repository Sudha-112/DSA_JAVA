package BasicMath;

public class GCD {

    public static int findGcd(int n1, int n2){
        int gcd = 0;
       for(int i = 1; i <= Math.min(n1, n2); i++){
           if(n1%i == 0 && n2%i ==0){
               gcd = i;
           }
       }
       return gcd;
    }

    public static void main(String[] args){
        int n1 = 20;
        int n2 = 15;
        int n = findGcd(n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + n);
    }
}
