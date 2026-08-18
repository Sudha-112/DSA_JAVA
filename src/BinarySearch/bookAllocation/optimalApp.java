package BinarySearch.bookAllocation;

public class optimalApp {

    public static boolean isAllocationPossible(int[] bookPages, int  barrier , int students){

        int allocateStudent = 1;
        int pages = 0;

        for(int i = 0 ; i < bookPages.length; i++){
            if(pages + bookPages[i] > barrier){
                allocateStudent++;
                pages = bookPages[i];
            }else{
                pages += bookPages[i];
            }
        }
        return allocateStudent <= students;
    }

    public static int minInMax(int[] bookPages, int students){

        int max = Integer.MIN_VALUE;
        for(int pages : bookPages){
            max = Math.max(max, pages);
        }

        int sum = 0;
        for(int pages : bookPages){
            sum += pages;
        }

        int si = max;
        int ei = sum;

        int minPages = 0;
        while(si <= ei){
            int mid = si + (ei -si)/2;
            if(isAllocationPossible(bookPages, mid, students)){
                minPages = mid;
                ei =  mid - 1;
            }else{
                si = mid + 1;
            }
        }
        return minPages;
    }

    public static void main(String[] args){

        int[] bookPages = {10,20,30,40};
        int students = 2;
        int ans = minInMax(bookPages, students);
        System.out.println(ans);
    }
}

//time complexity = O(n * log(sum - min + 1))
//space complexity = O(1)