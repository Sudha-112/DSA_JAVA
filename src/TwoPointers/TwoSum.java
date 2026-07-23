package TwoPointers;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int [] numbers, int target){

        int left = 0;
        int right  = numbers.length - 1;
//        ArrayList<Integer> arr = new ArrayList<>();
        int [] res = new int[2];

        while(left < right){
            int sum  = numbers[left] + numbers[right];
            if(sum ==  target){
//                arr.add(left+1);
//                arr.add(right+1);

                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }

        }
        return res;

    }


    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9};

         int [] res = twoSum(numbers,9);

         System.out.println(Arrays.toString(res));
    }

}
