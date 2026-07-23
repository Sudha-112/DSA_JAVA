package Recursion;

public class Fibonacci {

    public static int Fib(int n){

       if(n == 0 || n == 1){
           return n;
       }
       else{
           return Fib(n-2) + Fib(n-1);
       }

    }

    public static void main(String[] args){

        int n = 5;
        for( int i = 0; i <= n; i++){
            System.out.print(Fib(i) + " ");
        }

    }
}
