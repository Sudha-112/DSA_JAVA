package String;

public class largestOddNumber {

    public static String maxOddNum(String s){

        int si = 0;
        int ei = s.length()-1;

        while(si <= ei){
            if(s.charAt(si) == '0'){
                si++;
            }

            if(s.charAt(ei) % 2 != 0){
                if (s.charAt(si) != '0') {
                    return(s.substring(si, ei+1));
                }
            }else{
                ei--;
            }
        }
        return "0";
    }

    public static void main(String[] args){

        String s = "000000006";
        String ans = maxOddNum(s);
        System.out.println(ans);

    }

}


//time complexity = O(N)
//space complexity = O(1)