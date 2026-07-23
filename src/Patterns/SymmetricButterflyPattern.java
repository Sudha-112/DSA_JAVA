package Patterns;

public class SymmetricButterflyPattern {
    public static void main(String[] args){
        int n = 3;

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < 1; j++){

                //stars
                for(int k = 1; k <= i; k++){
                    System.out.print("*");
                }

                //spaces
                for(int k = 1; k <= 2*(n-i); k++){
                    System.out.print(" ");
                }

                //stars
                for(int k = 1; k <= i; k++){
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        for(int i = 1; i <= n-1; i++){
            for(int j = 0; j < 1; j++){

                //stars
                for(int k = 1; k <= n-i; k++){
                    System.out.print("*");
                }

                //spaces
                for(int k = 1; k <= 2*i; k++){
                    System.out.print(" ");
                }

                //stars
                for(int k = 1; k <= n-i; k++){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

}
