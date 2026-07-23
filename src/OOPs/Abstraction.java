package OOPs;

public class Abstraction {
    public static void main(String[] args) {
//        Horse h = new Horse();
//        h.eat();
//        h.walk();
//
//        Chicken c = new Chicken();
//        c.eat();
//        c.walk();


        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang
    }
}

abstract class Animal1{

    Animal1(){
        System.out.println("Animal constructor is called.....");
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();  // abstract functions have no implementation
}

class Horse extends Animal1{

    Horse(){
        System.out.println("Horse constructor is called....");
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{

    Mustang(){
        System.out.println("Mustang constructor is called....");
    }
}

class Chicken extends Animal1{
    void walk(){
        System.out.println("walks on 2 legs");
    }

}


//Abstract class

//cannot create the instance/objects of the abstract class
//can have abstract/non-abstract methods
//can have constructors