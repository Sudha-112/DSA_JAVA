package OOPs;

//public class accessModifiers {
//    public static void main(String[] args){
//       BankAccount myAcc = new BankAccount();
//       myAcc.username = "sudhapalyal";
//       myAcc.setPassword("sudha");
//
//    }
//
//}
//
//class BankAccount{
//    public String username;
//    private String password;
//    public void setPassword(String pwd){
//        password = pwd;
//    }
//}

class C1{
    public int x = 5;
    protected int  y = 45;
    int z = 6; // default modifier is being used over here
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class accessModifiers{
    public static void main(String[] args){

        C1 c = new C1();
        c.meth1();




    }
}

/*
             same      same       same
Modifier    class    package    subclass    world

Public       Y         Y           Y          Y
Protected    Y         Y           Y          N
Default      Y         Y           N          N
Private      Y         N           N          N

*/