package Patterns;
import java.util.Scanner;

class Solution{
    public void pattern(int N){
        //outer loop for rows
        for(int i = 1; i <= N; i++){
            //inner loop for columns
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class rightAngledNumberpyramid1 {
    public static void main(String[] args){
        //create object of solution class
        Solution obj = new Solution();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        obj.pattern(n);
    }
}

/*
   1
   1 2
   1 2 3
   1 2 3 4
 */

//Time complexity = O(N^2)
//Space complexity = O(1)





