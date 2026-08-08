package BinarySearch;

public class countOccurences {


    public static int firstOcc(int[] nums, int key){

        int si = 0;
        int ei = nums.length - 1;
        int first = -1;

        while(si <= ei){
            int mid = si + (ei- si)/2;

            if(nums[mid] == key){
                first = mid;
                ei = mid - 1;

            }else if(nums[mid] < key){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
        return first;
    }

    public static int lastOcc(int[] nums, int key){

        int si = 0;
        int ei = nums.length - 1;
        int last = -1;

        while(si <= ei){
            int mid = si + (ei- si)/2;

            if(nums[mid] == key){
                last = mid;
                si = mid + 1;

            }else if (nums[mid] > key){
                ei = mid - 1;
            }else{
                si = mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args){

        int[] arr = {1,2,2,2,2,3,3,3,4,5,5};
        int key = 5;
        int first = firstOcc(arr,key);
        int last = lastOcc(arr,key);

        if(first == -1){
            System.out.println(-1);
        }else{
            int countOcc = last - first + 1;
            System.out.println(countOcc);
        }
    }
}
//time complexity = O(logn)
//space complexity = O(1)