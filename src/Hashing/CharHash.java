package Hashing;

public class CharHash {

    public static void main(String[] args){

        String str = "HelloHowAreyou";

        int []hash = new int[256];

        for(int i = 0; i < str.length(); i++){
            hash[str.charAt(i)]++;
        }

        for(int i = 0; i < hash.length; i++){
            if(hash[i] > 0){

                System.out.println((char)i + " " + hash[i]);
            }
        }
    }
}
