package Arrayss.Matrix.rotateMatrixBy90;

public class optimalApp {

    public static void reverse(int[] arr) {

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[][] matrix){

        int row = matrix.length;
        int col = matrix[0].length;

        // swap elements in the diagonal
         for(int i = 0; i < row; i++){
             for(int j = i+1; j < col; j++){
                 int temp;
                 temp = matrix[i][j];
                 matrix[i][j]= matrix[j][i];
                 matrix[j][i] = temp;
             }
         }

         // reverse elements in the row
         for(int i = 0; i < row; i++){
             reverse(matrix[i]);
         }

         // print the resultant matrix
         for(int i = 0; i < row; i++){
             for(int j = 0; j < col; j++){
                 System.out.print(matrix[i][j]+ " ");
             }
             System.out.println();
         }

    }

    public static void main(String[] args){
        int[][] matrix ={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        rotate(matrix);
    }
}

//Time complexity = O(