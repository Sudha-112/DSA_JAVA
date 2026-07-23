package OOPs;

public class Constructors {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Sudha");
        Student s3 = new Student(123);
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;
    int marks[];


    Student(){
        System.out.println("Constructor is called.....");
    }

    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }


}


//Memory allocation happens when the constructor is called
//Constructors are called automatically only once, at object creation
//Constructors don't have a return type(not even void)
//Constructors have the same name as the class or structure