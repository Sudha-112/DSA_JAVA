package BinarySearch;

public class firstOccurence {

    public static int firstOcc(int[] nums, int key){

        int si = 0;
        int ei = nums.length - 1;
        int ans = -1;

        while(si <= ei){
            int mid = si + (ei- si)/2;

            if(nums[mid] == key){
                ans = mid;
                ei = mid - 1;

            }else if(nums[mid] < key){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){

        int[] arr = {1,2,7,7,7,7,8,8};
        int target = 8;

        int ans = firstOcc(arr, target);
        System.out.println(ans);
    }
}

//time complexity = O(logn)
//space complexity = O(1)