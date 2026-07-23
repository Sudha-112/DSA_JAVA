package Patterns;

class Pattern{
    public void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n-1; i++){
            for(int k = 1; k <= n-i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

public class halfDiamondStarPattern {
    public static void main(String[] args){
        Pattern obj = new Pattern();
        int n = 3;

        obj.printPattern(n);
    }
}

/*
    *
    * *
    * * *
    * *
    *
 */
