package Arrayss;

public class isArrayRotated {

    public static boolean isRotated(int[] arr){

        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }

        if(count == 0 || count == 1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){

        int[] arr = {3,4,5,1,2};
        boolean ans = isRotated(arr);
        System.out.println(ans);
    }
}
