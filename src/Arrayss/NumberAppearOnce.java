package Arrayss;

import java.util.HashMap;

public class NumberAppearOnce {

    public static int numberAppearOnce(int[]arr){

        int xor = 0;

        for (int num : arr) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3, 3, 4, 1};
        int ans = numberAppearOnce(nums);
        System.out.println(ans);

    }
}











