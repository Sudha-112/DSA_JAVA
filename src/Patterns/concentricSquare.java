package Patterns;
import java.util.*;

public class concentricSquare {
    public static void main(String[] args) {

        int n = 4;

        int size = 2 * n - 1;

        //outer loop for rows
        for (int i = 0; i < size; i++) {
            //inner loop for columns
            for (int j = 0; j < size; j++) {

                //calculate distance from top
                int top = i;

                //calculate distance from left
                int left = size - 1 - j;

                //calculate distance from right
                int right = j;

                //calculate distance from bottom
                int bottom = size - 1 - i;

                int min_Dis = Math.min(Math.min(top, bottom), Math.min(left, right));

                int number = n - min_Dis;
                System.out.print(number);
            }
            System.out.println();
        }
    }
}


