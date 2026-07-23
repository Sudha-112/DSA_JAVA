package Patterns;

class Alpha{
    public void printPattern(int n){
        char a = 'A';
        for(int i  = 1; i <= n; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(a + " ");
            }
            a++;
        System.out.println();
        }
    }
}


public class alphaRampPattern {
    public static void main(String[] args){
        Alpha obj = new Alpha();
        int n = 5;
        obj.printPattern(n);
    }
}

/*

A
B B
C C C
D D D D
E E E E E

 */