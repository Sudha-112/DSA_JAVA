package Arrayss;

public class DuplicatesRemovalSA {

    public static void removeDuplicates(int[]arr){

        int n = arr.length;

        int j = 0;

        for(int i = 1 ; i < n; i++){
            if(arr[i]!= arr[i-1]){
                j++;
                arr[j] = arr[i];
            }
        }

        for(int i = 0; i <= j; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,4,4,7,7,7,8,8,9};

//        HashSet<Integer> set = new HashSet<>();
//
//        for(int num : arr){
//            set.add(num);
//        }
//
//       for(int num : set){
//           System.out.print(num + " ");
//       }

        //two pointer method

        removeDuplicates(arr);


    }
}
