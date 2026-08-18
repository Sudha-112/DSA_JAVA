package BinarySearch.painterPartition;

public class optimalApp {

    public static boolean isAllocationPossible(int[] boards, int  barrier , int painters){

        int allocatePainter = 1;
        int board = 0;

        for(int i = 0 ; i < boards.length; i++){
            if(board + boards[i] > barrier){
                allocatePainter++;
                board = boards[i];
            }else{
                board += boards[i];
            }
        }
        return allocatePainter <= painters;
    }

    public static int minInMax(int[] boards, int painters){

        int max = Integer.MIN_VALUE;
        for(int board : boards){
            max = Math.max(max, board);
        }

        int sum = 0;
        for(int board : boards){
            sum += board;
        }

        int si = max;
        int ei = sum;

        int minBoardArea = 0;
        while(si <= ei){
            int mid = si + (ei -si)/2;
            if(isAllocationPossible(boards, mid, painters)){
                minBoardArea = mid;
                ei =  mid - 1;
            }else{
                si = mid + 1;
            }
        }
        return minBoardArea;
    }

    public static void main(String[] args){

        int[] boards = {10,20,30,40};
        int painters = 2;
        int ans = minInMax(boards, painters);
        System.out.println(ans);
    }
}
