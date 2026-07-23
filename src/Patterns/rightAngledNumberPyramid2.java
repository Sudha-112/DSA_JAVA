package Patterns;

class Solution1{
    public void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}


public class rightAngledNumberPyramid2 {
    public static void main(String[] args){
        Solution1 obj = new Solution1();

        int N = 5;
        obj.printPattern(N);

    }
}

/*
   1
   2 2
   3 3 3
   4 4 4 4
   5 5 5 5 5
 */
