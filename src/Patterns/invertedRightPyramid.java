package Patterns;

class Solution2{
    public void printPattern(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
public class invertedRightPyramid {
    public static void main(String[] args){
        Solution2 obj = new Solution2();

        int N = 5;
        obj.printPattern(N);

    }
}
/*
   * * * * *
   * * * *
   * * *
   * *
   *
 */
