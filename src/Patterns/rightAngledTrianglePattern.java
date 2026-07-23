package Patterns;

class Solution6{
    public void printPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
public class rightAngledTrianglePattern {
    public static void main(String[] args){
      Solution6 obj = new Solution6();
      int n = 5;
      obj.printPattern(n);

    }

}

/*
   *
   * *
   * * *
   * * * *

 */
 //Time complexity = O(N^2)
//Space complexity = O(1)