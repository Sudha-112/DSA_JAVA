package Arrayss.Matrix.setMatrixZeroes;

public class bruteforce {

    public static void setMatZero(int[][] arr){

        int row = arr.length;
        int col = arr[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] == 0){

                    // for row
                    for(int k = 0; k < col; k++){
                        if(arr[i][k]!= 0){
                            arr[i][k] = -1;
                        }
                    }
                    // for column
                    for(int k = 0; k < row; k++){
                        if(arr[k][j]!=0){
                            arr[k][j] = -1;
                        }
                    }

                }
            }
        }

        // replace -1 with 0
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] == -1){
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

//Time complexity = O(n*m*(n+m))
//space complexity = O(1)
