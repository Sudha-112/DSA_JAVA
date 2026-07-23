package Arrayss.Matrix.rotateMatrixBy90;

public class bruteforce {

    public static int[][] rotate(int[][] matrix){

        int row = matrix.length;
        int col = matrix[0].length;
        int[][] newMatrix = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                newMatrix[j][row-i-1]= matrix[i][j];
            }
        }

        return newMatrix;
    }

    public static void main(String[] args){

        int[][] matrix = {{0, 1, 1, 2}, {2, 0, 3, 1}, {4, 5, 0, 5}, {5, 6, 7, 0}};

        int[][] resultMat = rotate(matrix);

        for(int[] num : resultMat){
            for(int val : num){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}

//Time complexity = O(n^2)
// space complexity = O(n^2)
