package String;

public class removeOuterParantheses {

    public static String remove( String str){

        int level = 0;
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch == '('){
                level++;
                if(level > 1){
                    result.append(ch);
                }
            }
            if(ch ==')'){
                if(level>1){
                    result.append(ch);
                }
                level--;
            }
        }
        return result.toString();
    }
     public static void main(String[] args){

         String str = "((()())(()))()";

         String ans = remove(str);
         System.out.println(ans);

     }
}
// time complexity = O(N)
// space complexity = O(N)