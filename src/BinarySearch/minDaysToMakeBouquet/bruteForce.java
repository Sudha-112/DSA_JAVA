package BinarySearch.minDaysToMakeBouquet;

public class bruteForce {

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

        for(int i = minVal(arr) ; i <= maxVal(arr); i++){
            if(possible(arr, i, m, k)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        int [] arr = {7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;
        int ans = minDays(arr, m, k);
        System.out.println(ans);
    }
}

//time complexity = O((max - min + 1)*N)
// space complexity = O(1)