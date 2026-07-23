package TwoPointers;

public class removeDuplicates {

    public static void remove(int[] arr){

        int n = arr.length;
        int j = 1;

        for(int i = 1; i < n; i++){
           if(arr[i] != arr[j-1]){

               arr[j] = arr[i];
               j++;
           }
        }

        for(int k = 0; k < j; k++){
           System.out.print(arr[k] + " ");
       }
    }



    public static void main(String[] args){
        int[] arr = { 0,0,1,1,2,3,3};
         remove(arr);
    }

}
