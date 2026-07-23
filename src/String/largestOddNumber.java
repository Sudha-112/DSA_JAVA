package String;

public class largestOddNumber {
    public static void main(String[] args){

        String s = "0000054376";

        int si = 0;
        int ei = s.length()-1;

       while(si <= ei){
           if(s.charAt(si) == '0'){
               si++;
           }

           if(s.charAt(ei) % 2 != 0){
               if (s.charAt(si) != '0') {
                   System.out.println(s.substring(si, ei+1));
               break;
               }
           }else{
               ei--;
           }
       }
    }

}
