package Patterns;

public class diamondStarPattern {
    public static void main(String[] args){
        Solution4 obj1 = new Solution4();
        Solution5 obj2 = new Solution5();

        int n = 5;
        obj1.printPattern(n);
        obj2.printPattern(n);
    }
}

/*
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
 */
