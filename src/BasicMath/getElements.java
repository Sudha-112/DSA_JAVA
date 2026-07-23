package BasicMath;

public class getElements {

   public static void secMaxAndMin(int[] arr) {
        int n = arr.length;
       if(n == 0 || n == 1){
           System.out.println(-1 + " " + -1);
           return;
       }

       int small = Integer.MAX_VALUE, second_small = Integer.MAX_VALUE;
       int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;

       for(int i = 0; i < n; i++){
           small = Math.min(small, arr[i]);
           large = Math.max(large, arr[i]);
       }

       for(int i = 0; i < n; i++){
           if(arr[i] < second_small && arr[i]!= small){
               second_small =arr[i];
           }
           if(arr[i] > second_large && arr[i]!= large){
               second_large = arr[i];
           }

       }

       System.out.println("Second largest element is : " + second_large);
       System.out.println("Second smallest element is : " + second_small);

   }

   public static void main(String[] args){
        int [] arr = {1,2,4,7,7,15};
        secMaxAndMin(arr);

    }
}
