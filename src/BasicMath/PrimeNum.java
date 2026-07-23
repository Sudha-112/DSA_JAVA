package BasicMath;

public class PrimeNum {

    public static void isPrime(int n){
        int divisors = printDivisors(n);

        if(divisors == 2 && n%1==0 && n%n==0){
            System.out.print(n + " is the prime number");
        }else{
            System.out.print(n + " is not the prime number");
        }
    }

    public static int printDivisors(int n) {
        int divisors = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                divisors++;
            }

        }
        return divisors;
    }

    public static void main(String[] args) {
        int n = 73;
        isPrime(n);
    }

}




