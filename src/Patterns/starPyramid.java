package Patterns;

class Solution4{
    public void printPattern(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" " + " ");
            }
            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}



public class starPyramid {
    public static void main(String[] args){
      Solution4 obj = new Solution4();

      int n = 5;
      obj.printPattern(n);
    }
}

/*

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */
