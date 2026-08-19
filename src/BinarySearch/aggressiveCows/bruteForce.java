package BinarySearch.aggressiveCows;

import java.util.Arrays;

public class bruteForce {

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

        int max = stalls[n-1];
        int min = stalls[0];
        for(int i = 1; i <= max - min; i++){
            if(canWePlace(stalls, i, cows)){
                continue;
            }else{
                return i-1;
            }
        }
        return -1;

    }

    public static void main(String [] args){

        int [] stalls = {0,3,4,7,10,9};
        int cows = 4;

        int ans = maxInMin(stalls, cows);
        System.out.println(ans);
    }
}

//time complexity= O((max-min) * n) + O(nlogn)
// space complexity = O(1)