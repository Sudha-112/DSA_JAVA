package BinarySearch.CapacityOfShip;

public class optimalApp {


    public static int findDays(int[] nums, int cap){
        int days = 1, load = 0;
        for(int i = 0; i < nums.length; i++){
            if(load + nums[i] > cap){
                days++;
                load = nums[i];
            }else{
                load += nums[i];
            }
        }
        return days;
    }

    public static int findCap(int []nums, int day){

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }

        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        int cap = 0;
        int daysReq = 0;
         int si = max;
         int ei = sum;
         while(si <= ei){
             int mid = si + (ei-si)/2;
             daysReq = findDays(nums, mid);

             if(daysReq <= day){
                 cap = mid;
                 ei = mid - 1;
             }else{
                 si = mid + 1;
             }
         }
        return cap;
    }

    public static void main(String [] args){

        int[] arr = {1,2,3,4,5};
        int days = 2;
        int ans = findCap(arr, days);
        System.out.println(ans);
    }
}

// time complexity = O(n * log(sum - max + 1))
//space complexity = O(1)