package BinarySearch;

public class noOfRotations {

    public static int findRotations(int[] nums){

        int n = nums.length;
        int low = 0;
        int high = n-1;
        int count = 0;

        while(low  < high){

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {

                high = mid;
            }
        }


        return low;
    }


    public static void main(String[] args){
        int[] arr = {3,4,5,1,2};

        int ans = findRotations(arr);
        System.out.println(ans);
    }
}
