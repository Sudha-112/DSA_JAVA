package BinarySearch;

public class peakElement {

    public static int peakEl(int[] nums){
    int n = nums.length;
    int si = 0;
    int ei = n-1;

    while (si < ei) {

                int mid = si  + (ei-si) / 2;

                // If mid-element is greater than next
                if (nums[mid] > nums[mid + 1]) {
                    // Move to left-half
                    ei = mid;
                } else {
                    // Move to right-half
                    si = mid + 1;
                }
            }

            // Return peak index
            return si;
        }




public static void main(String[] args){

    int[] arr = {1,2,3,4,5,9,8};

    int ans = peakEl(arr);
    System.out.println(ans);
}
}
