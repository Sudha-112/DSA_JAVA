package Patterns;

//class Hill {
//    public void printPattern(int n) {
//        for (int i = 1; i <= n; i++) {
//
//            //spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" " + " ");
//            }
//
//            //print alphas
//            char a = 'A';
//            for(int j = 1; j <= i; j++){
//
//                if(j==i && i != 1){
//                    for(int k = 1; k <= i-1; k++) {
//                        System.out.print(a + " ");
//                        a--;
//                    }
//
//                        }
//                System.out.print(a + " ");
//                a++;
//                    }
//
//            System.out.println();
//        }
//    }
//}

class Hill {
    public void printPattern(int n) {
        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }

            //print alphas
            char a = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {

                //Increment or decrement character
                System.out.print(a + " ");
                if (j <= breakpoint) a++;
                else a--;

            }


            System.out.println();
        }
    }
}




public class alphaHillPattern {
    public static void main(String[] args){
        Hill obj = new Hill();
        int n = 4;
        obj.printPattern(n);
    }
}

/*
      A
    A B A
  A B C B A
A B C D C B A

 */
