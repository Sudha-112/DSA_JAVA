package Patterns;

class Solution3{
     public void printPattern(int n){
         for(int i = n; i >= 1; i--){
             for(int j = 1; j <= i; j++){
                 System.out.print(j + " ");
             }
             System.out.println();
         }
     }
 }

public class invertedNumberedRightPyramid {
    public static void main(String[] args){
        Solution3 obj = new Solution3();
         int N = 5;
         obj.printPattern(N);
    }
}

/*
  1 2 3 4 5
  1 2 3 4
  1 2 3
  1 2
  1
 */
