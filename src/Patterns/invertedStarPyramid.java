package Patterns;

class Solution5{
    public void printPattern(int n){
        for(int i = n; i >= 1; i--){

            for(int j = 1; j <= n-i; j++){
                System.out.print(" " + " ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }

}

public class invertedStarPyramid {
    public static void main(String[] args){
        Solution5 obj = new Solution5();
         int n = 5;
         obj.printPattern(n);
    }
}

/*

 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
 */