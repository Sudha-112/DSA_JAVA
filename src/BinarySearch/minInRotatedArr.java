package BinarySearch;

public class minInRotatedArr {

    public static int searchMin(int[] nums) {
        int n = nums.length;
        int si = 0, ei = n - 1;

        while (si < ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] > nums[ei]) {
                si = mid + 1;
            } else {
                ei = mid;
            }
        }
        return nums[si];
    }

    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};

        int ans = searchMin(arr);
        System.out.println(ans);
    }
}
