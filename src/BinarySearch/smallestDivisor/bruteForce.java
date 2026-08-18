package BinarySearch.smallestDivisor;

public class bruteForce {

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

        int sum = 0;
        int divisor = 0;
        for(int i = 1; i <= maxVal(nums); i++){
           sum = SumOfDiv(nums,i);

           if(sum<=l){
               divisor = i;
               break;
           }
        }

            return divisor;

    }

    public static void main(String [] args){

        int[] arr = {8,4,2,3};
        int limit = 10;
        int ans = findDiv(arr, limit);
        System.out.println(ans);
    }
}
// time complexity = O(n * maxEl)
// space complexity = O(1)