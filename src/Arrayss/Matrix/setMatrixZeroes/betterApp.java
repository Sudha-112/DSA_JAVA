package Arrayss.Matrix.setMatrixZeroes;

public class betterApp {

    public static void setMatZero(int[][] arr){

        int row = arr.length;
        int col = arr[0].length;

        int[] rows = new int[row];
        int[] cols = new int[col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] == 0){
                    rows[i] = 1;  // mark rows as 1
                    cols[j] = 1; // mark cols as 1
                }
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(rows[i] == 1 || cols[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }

        //Print the result matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args){

        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        setMatZero(matrix);
    }
}

//Time complexity = O(n*m)
// space complexity = O(n+m)