package Arrayss;

public class SecondLargestElement {

    public static int secondLargestEl(int[] arr) {

        int n = arr.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE ;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }

        System.out.println("The first largest element : " + max1);

        int val = 0;  // to check if second-largest element occurs or not
        for (int i = 0; i < n; i++) {

            if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
                val++;
            }

        }
           if(val == 0) {
               return -1;
           }else{
               return max2;
           }
    }

   public static void main(String[] args){

        int[] arr = {2,2,2,2,2};

        int ans = secondLargestEl(arr);
        System.out.println("The second largest element : " + ans);
    }
}
