package BinarySearch.kokoEatingBananas;

public class bruteForce {

    public static int minEatingSpeed(int[] piles, int h){

        int n = piles.length;
        int k = 1;

        while(k<=piles[n-1]) {
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.ceil((double)piles[i] / k);
            }

            if (ans <= h) {
                return k;
            } else k++;
        }
        return -1;
    }

    public static void main(String []args){

        int []arr = {3,6,7,11};
        int h = 8;
        int ans = minEatingSpeed(arr, h);
        System.out.println(ans);
    }
}

//time complexity = O(maxEl * n)
//space complexity = O(1)
