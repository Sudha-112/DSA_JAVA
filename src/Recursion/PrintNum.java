package Recursion;

public class PrintNum {

    public static void print(int count, int n){

        if(count>n){  // base case
            return;
        }
        else {

            System.out.println(count);
            print(count+1, n);
        }
    }

    public static void main(String[] args){
        int n = 5;
        print(1,n);
    }

}
