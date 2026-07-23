package Arrayss.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class printPascalTriangle {

    public static List<List<Integer>> print(int n){

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i ; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int value = triangle.get(i-1).get(j-1) +
                                triangle.get(i-1).get(j);
                    row.add(value);
                }
            }
            triangle.add(row);

        }


        return triangle;
    }

    public static void main(String[] args){

        int n = 4;

         List<List<Integer>> result = print(n);

         for(List<Integer> row: result){
             System.out.println(row);
        }
    }
}
