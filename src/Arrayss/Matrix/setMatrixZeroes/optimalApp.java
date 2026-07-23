package Arrayss.Matrix.setMatrixZeroes;

public class optimalApp {

    public static void setMatZero(int[][] arr){

        // mark rows and cols
        // int[][] col = matrix[0][...];
        // int[][] row =  matrix[...][0];
        int col0 = 1;
        int row = arr.length;
        int col = arr[0].length;

        // mark row and col zero
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] == 0){
                    //mark i-th row
                    arr[i][0] = 0;

                    //mark j-th col
                    if(j!=0) {
                        arr[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }

        // assign zero to elements having atleast row or col zero
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(arr[i][j]!=0){
                    if(arr[i][0] == 0 || arr[0][j] == 0){
                        arr[i][j] = 0;
                    }
                }
            }
        }

        // marking col zero
        if(arr[0][0] == 0){
            for(int j = 0; j < col; j++){
                arr[0][j] = 0;
            }
        }

        // marking row zero
        if(col0 == 0){
            for(int i = 0; i < row; i++){
                arr[i][0] = 0;
            }
        }

    // print the result matrix
        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

//        int[][] matrix = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{1,0,0,1}};

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatZero(matrix);
    }

}

// Time complexity = O(n*m)
// space complexity = O(1)