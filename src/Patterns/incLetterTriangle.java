package Patterns;

class Letter{
    public void printPattern(int n){
        for(int i = 1; i <= n; i++){
            char a = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}

public class incLetterTriangle{
    public static void main(String[] args){
        Letter obj = new Letter();
        int n = 5;
        obj.printPattern(n);
    }
}

/*

A
A B
A B C
A B C D
A B C D E

 */
