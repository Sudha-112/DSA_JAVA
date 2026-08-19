package BinarySearch.max1InRows;

public class bruteForce {

    public static int findMax1(int[][] matrix){

        int n = matrix.length;
        int m = matrix[0].length;
        int maxCount = -1;
        int index = -1;
        for(int i = 0; i < n; i++){
            int cnt1Row = 0;
            for(int j = 0; j < m; j++){
                cnt1Row += matrix[i][j];
            }

            if(cnt1Row > maxCount){
                maxCount= cnt1Row;
                index = i;
            }
        }
        return index;
    }

    public static void main(String [] args){

        int[][] matrix = {
                {0,0,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1},
                {0,0,0,1,1},
                {0,1,1,1,1}
        };

        int ans = findMax1(matrix);
        System.out.println(ans);
    }
}

//time complexity = O(n*m)
//space complexity = O(1)