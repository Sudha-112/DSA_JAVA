package BinarySearch.findKthMissingNumber;

public class optimalApp {

    public static int findKthMissing(int[] nums, int k){

        int n = nums.length;
        int si = 0;
        int ei = n -1;

        while(si<=ei){
            int mid = si + (ei-si)/2;
            int missingNo = nums[mid] - (mid + 1);

            if(missingNo < k){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
        return si + k;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        int ans = findKthMissing(arr, k);
        System.out.println("Kth Missing Number: " + ans);
    }
}

//time complexity  = O(logn)
// space complexity = O(1)
