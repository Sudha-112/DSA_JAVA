package BinarySearch.smallestDivisor;

public class optimalApp {

    public static int maxVal(int [] nums){

        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }
        return max;
    }

    public static int SumOfDiv(int[] nums, int div){

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Math.ceil((double) nums[i]/div);
        }
        return sum;
    }

    public static int findDiv(int[] nums, int l){

        int divisor = 0;
        int sum = 0;
        int si = 1, ei = maxVal(nums);

        while(si<=ei){

            int mid = si + (ei - si)/2;
            sum = SumOfDiv(nums,mid);
            if(sum <= l){
                divisor = mid;
                ei = mid - 1;
            }else{
                si = mid + 1;
            }
        }


        return divisor;

    }

    public static void main(String [] args){

        int[] arr = {1,2,3,4,5};
        int limit = 8;
        int ans = findDiv(arr, limit);
        System.out.println(ans);
    }
}
// time complexity = O(n* log(maxEl))
// space complexity = O(1)

