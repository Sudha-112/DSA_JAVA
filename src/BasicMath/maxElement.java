package BasicMath;

public class maxElement {

  public static int Max(int[] arr){

      int n = arr.length;
      int max = Integer.MIN_VALUE;
      for(int i = 0; i < n; i++){
          if(arr[i] > max){
              max = arr[i];
          }
      }
      return max;
  }


    public static void main(String[] args){

        int[] arr = {4,66,7,3,90};
        int ans = Max(arr);
        System.out.println(ans);
    }
}
