package BinarySearch;

public class searchInRotatedII {

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int si = 0, ei = n - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) return mid;

            if(nums[si] == nums[mid] && nums[mid] == nums[ei]) {
                 si++;
                 ei--;
            }

            if (nums[si] <= nums[mid]) { // left half sorted
                if (nums[si] <= target && target < nums[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            } else { // right half sorted
                if (nums[mid] < target && target <= nums[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,0,1,1,1};
        int target = 0;

        int ans = search(arr, target);
        System.out.println(ans);
    }
}
