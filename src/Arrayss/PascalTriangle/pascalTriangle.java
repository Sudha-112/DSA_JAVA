package Arrayss.PascalTriangle;

public class pascalTriangle {

    public static void main(String[] args) {
        int n = 6;  // row number
        int r = 6;  // row
        int c = 3;  // column
        int ans = 1;

        for (int i = 1; i < c; i++) {
             ans = ans * (n-i);
             ans = ans/i;
        }

        System.out.println(ans);
    }
}
