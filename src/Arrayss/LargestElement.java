package Arrayss;

public class LargestElement {

    public static int largestEl(int[] arr){

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){

            if(arr[i]> max){
                max = arr[i];
            }
        }

        return max;

    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 0};

        int ans = largestEl(arr);
        System.out.println(ans);
    }
}
