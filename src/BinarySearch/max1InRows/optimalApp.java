package BinarySearch.max1InRows;

public class optimalApp {

    // Binary search to find first occurrence of 1 in a sorted row
    public static int lowerBoundOfOne(int[] row, int m){
        int low = 0, high = m - 1;
        int firstOneIndex = m;  // agar row mein koi 1 nahi mila to m hi rahega (matlab 0 ones)

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(row[mid] >= 1){
                firstOneIndex = mid;
                high = mid - 1;   // aur pehle 1 dhundo (left side mein)
            } else {
                low = mid + 1;
            }
        }
        return firstOneIndex;
    }

    public static int findMax1(int[][] matrix){

        int n = matrix.length;
        int m = matrix[0].length;
        int maxCount = 0;
        int index = -1;

        for(int i = 0; i < n; i++){
            int firstOneIdx = lowerBoundOfOne(matrix[i], m);
            int cnt1Row = m - firstOneIdx;  // total 1's in this row

            if(cnt1Row > maxCount){
                maxCount = cnt1Row;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args){

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

//time complexity = O(n * log(m))
//space complexity = O(1)