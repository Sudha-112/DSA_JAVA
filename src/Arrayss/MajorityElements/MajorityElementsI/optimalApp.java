package Arrayss.MajorityElements.MajorityElementsI;

import java.util.HashMap;

public class optimalApp {

    public static int majorityEle(int[] arr){

        //Voting approach
        int n = arr.length;

        int el = 0;
        int count = 0;
        for(int i = 0 ; i < n; i++){
           if(count == 0){
               count = 1;
               el = arr[i];
           }else if(el == arr[i]){
               count++;
           }else{
               count--;
           }

        }

        int count1 = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == el){
                count1++;
            }
        }

        if(count1 > n/2){
            return el;
        }

       return -1;
    }

    public static void main(String[] args) {


        int[] arr = {7,0,0,1,7,7,2,7,7};
        int ans = majorityEle(arr);
        System.out.println(ans);
    }
}
