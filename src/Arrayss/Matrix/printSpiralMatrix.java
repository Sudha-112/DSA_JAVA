package Arrayss.Matrix;

import java.util.ArrayList;

public class printSpiralMatrix {

    public static ArrayList<Integer> printSpiral(int[][] matrix){

        ArrayList<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(left <= right && top <= bottom){

            //Left to right
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            // top to bottom
            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            // right to left
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom to top
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }

    public static void main(String[] args){

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

       ArrayList<Integer> ans =  printSpiral(matrix);
       for(int num : ans){
           System.out.print(num + " ");
       }
    }
}

//Time complexity = O(n*m)
// space complexity = O(1)