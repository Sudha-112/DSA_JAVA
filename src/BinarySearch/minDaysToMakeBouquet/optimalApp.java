package BinarySearch.minDaysToMakeBouquet;

public class optimalApp {

    public static int minVal(int[] arr){

        int min = Integer.MAX_VALUE;
        for(int num : arr){
            min = Math.min(min, num);
        }
        return min;
    }

    public static int maxVal(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int num : arr){
            max = Math.max(max, num);
        }
        return max;
    }

    public static boolean possible(int[] arr, int day, int m, int k){

        int count = 0;
        int noOfBouq = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] <= day){
                count++;
            }else{
                noOfBouq += count/k;
                count = 0;
            }
        }
        noOfBouq += count/k;
        if(noOfBouq >= m) return true;
        else return false;
    }


    public static int minDays(int[] arr, int m, int k){

       int si = minVal(arr);
       int ei = maxVal(arr);
       int ans = ei;

       if(arr.length < m*k) return -1;

       while(si <= ei){
           int mid = si + (ei - si)/2;
          if(possible(arr, mid, m, k)){
              ans = mid;
              ei = mid - 1;
          }else{
              si = mid + 1;
          }

       }
       return ans;
    }

    public static void main(String [] args){
        int [] arr = {7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;
        int ans = minDays(arr, m, k);
        System.out.println(ans);
    }
}

// time complexity = O(N* log(max - min + 1))
// space complexity  = O(1)