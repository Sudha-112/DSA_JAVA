package BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        int n = arr.length;
        int si = 0;
        int ei = n-1;

        while(si < ei){

            int mid = si + (ei-si)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        int ans = binarySearch(arr,1);
        System.out.println(ans);
    }

}
//time complexity = O(logn)
//space complexity = O(1)