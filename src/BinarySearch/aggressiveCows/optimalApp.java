package BinarySearch.aggressiveCows;

import java.util.Arrays;

public class optimalApp {

    public static boolean canWePlace(int [] stalls, int dis, int cows){

        int cntCows = 1;
        int last = stalls[0];
        int n = stalls.length;

        for(int i = 1; i < n; i++){
            if(stalls[i] - last >= dis){
                cntCows++;
                last = stalls[i];
            }
        }
        return cntCows >= cows;
    }


    public static int maxInMin(int[] stalls, int cows){

        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canWePlace(stalls, mid, cows)){
                ans = mid;
                low = mid + 1;   // aur bada distance try karo
            } else {
                high = mid - 1;  // chota distance try karo
            }
        }
        return ans;

    }

    public static void main(String [] args){

        int [] stalls = {0,3,4,7,10,9};
        int cows = 4;

        int ans = maxInMin(stalls, cows);
        System.out.println(ans);
    }
}

//time complexity= O(log(max-min) * n) + O(nlogn)
// space complexity = O(1)

