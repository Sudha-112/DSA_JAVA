package Hashing;

//hash table = tells the number of occurrences of the given number in the array
public class IntHash {

    public static void main(String[] args){
        int []arr = {1,1,1,2,4,5,4};

        int []hash = new int [6];

        for(int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }
         for(int i = 0; i < hash.length; i++) {
             if (hash[i] > 0) {
                 System.out.println(i +" "+hash[i]);
             }
         }

    }

}
