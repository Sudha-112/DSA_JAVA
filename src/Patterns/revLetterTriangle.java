package Patterns;

class revLetter{
    public void printPattern(int n){
        for(int i = n; i >= 1; i--){
            char a = 'A';
            for(int j = i; j >= 1; j--){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

}

public class revLetterTriangle {
    public static void main(String[] args){
        revLetter obj = new revLetter();
        int n = 5;
        obj.printPattern(n);

    }
}

/*

A B C D E
A B C D
A B C
A B
A

 */
