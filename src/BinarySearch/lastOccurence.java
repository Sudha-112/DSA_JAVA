package BinarySearch;

public class lastOccurence {

    public static int lastOcc(int[] nums, int key){

        int si = 0;
        int ei = nums.length - 1;
        int ans = -1;

        while(si <= ei){
            int mid = si + (ei- si)/2;

            if(nums[mid] == key){
                ans = mid;
                si = mid + 1;

            }else if (nums[mid] > key){
                ei = mid - 1;
            }else{
                si = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){

        int[] arr = {1,2,7,7,7,7,8,8,8,8};
        int target = 8;

        int ans = lastOcc(arr, target);
        System.out.println(ans);
    }
}

//time complexity = O(logn)
//space complexity = O(1)
