package BinarySearch.kokoEatingBananas;

public class optimalApp {

    public static int maxVal(int[]piles){

        int maxVal = 0;
        for(int i = 0; i < piles.length; i++){
            maxVal = Math.max(maxVal, piles[i]);
        }
        return maxVal;
    }

    public static int reqTime(int[] piles, int mid){
        int requiredTime = 0;

        for(int i = 0; i < piles.length; i++){
            requiredTime += Math.ceil((double)piles[i]/mid);
        }
        return requiredTime;
    }


        public static int minEatingSpeed(int[] piles, int h){

            int n = piles.length;
            int si = 1;
            int ei = maxVal(piles);
            int minSpeed = 0;

           while(si <= ei){
               int mid = si + (ei-si)/2;

               int ans = reqTime(piles, mid);
               if(ans <= h){
                   minSpeed = mid;
                   ei = mid - 1;
               }else{
                   si = mid + 1;
               }

           }
           return minSpeed;

        }

        public static void main(String []args){

            int []arr = {3,6,7,11,14};
            int h = 8;
            int ans = minEatingSpeed(arr, h);
            System.out.println(ans);
        }

}
    // time complexity = O(n×log(maxPile))
    // space complexity = O(1)