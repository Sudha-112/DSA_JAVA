package Patterns;

class Alpha1{
    public void printPattern(int n) {
        char ch = 'E';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            ch--;
            for(int j = 1; j <= i; j++){
                ch--;
            }
            System.out.println();
        }
    }
}

public class alphaTrianglePattern {
    public static void main(String[] args){
        Alpha1 obj = new Alpha1();
        int n = 5;
        obj.printPattern(n);
    }
}

/*

E
D E
C D E
B C D E
A B C D E

 */
