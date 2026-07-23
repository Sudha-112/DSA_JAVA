package Arrayss;

public class Intersection {

    public static void intersection(int[] arr1, int[] arr2){

        int i = 0 , j = 0;

        while(i < arr1.length && j < arr2.length){

//            remove duplicate elements in arr1
            if(i>0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }

            //remove duplicate elements in arr2
            if(j>0 && arr2[j] == arr2[j-1]){
                j++;
                continue;
            }

            if(arr1[i] == arr2[j]){

                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }else{

                j++;
            }

        }

    }


    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,4,5,6};

        intersection(arr1,arr2);
    }
}
