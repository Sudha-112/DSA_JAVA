package Patterns;

class Star{
    public void printPattern(int n){
        for(int i = 1; i <= n; i++){ // no of rows
            for(int j = 1; j <= n; j++){ //no of stars to be printed in a row
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}

public class rectangularStarPattern {
    public static void main(String[] args){
        Star obj = new Star();
        int n = 4;
        obj.printPattern(n);

    }
}

/*
  * * * *
  * * * *
  * * * *
  * * * *
 */


//Time complexity = O(N^2)
//Space complexity = O(1) ,as no additional space is used