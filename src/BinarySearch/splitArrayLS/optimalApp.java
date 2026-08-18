package BinarySearch.splitArrayLS;

public class optimalApp {
    public static boolean isSumPossible(int[] arr, int  barrier , int k){

        int allocate= 1;
        int element = 0;

        for(int i = 0 ; i < arr.length; i++){
            if(element + arr[i] > barrier){
                allocate++;
                element = arr[i];
            }else{
                element += arr[i];
            }
        }
        return allocate <= k;
    }

    public static int minInMax(int[] arr, int k){

        int max = Integer.MIN_VALUE;
        for(int num : arr){
            max = Math.max(max, num);
        }

        int sum = 0;
        for(int num : arr){
            sum += num;
        }

        int si = max;
        int ei = sum;

        int minSum = 0;
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(isSumPossible(arr, mid, k)){
                minSum = mid;
                ei =  mid - 1;
            }else{
                si = mid + 1;
            }
        }
        return minSum;
    }

    public static void main(String[] args){

        int[] arr = {10,20,30,40};
        int k = 2;
        int ans = minInMax(arr, k);
        System.out.println(ans);
    }
}
