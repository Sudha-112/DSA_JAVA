package BinarySearch;

public class upperBound {

    public static int lowerBnd(int[] nums, int key){

        int si = 0;
        int ei = nums.length - 1;
        int ans = -1;

        while(si <= ei){
            int mid = si + (ei- si)/2;

            if(nums[mid] > key){
                ans = mid;
                ei = mid - 1;

            }else{
                si = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){

        int[] arr = {1,2,2,3,6,7,8};
        int target = 7;

        int ans = lowerBnd(arr, target);
        System.out.println(ans);
    }
}
//time complexity = O(logn)
//space complexity = O(1)

// upper bound =  arr[i] > target (pehla element jo target > hai)