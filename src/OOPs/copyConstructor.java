package OOPs;

public class copyConstructor {
    public static void main(String[] args){
        Students s1 = new Students();
        s1.name = "sudha";
        s1.roll = 12;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Students s2 = new Students(s1);
        s1.marks[2] = 45;
        s2.password  ="xyz";

        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Students{
    String name;
    int roll;
    int marks[];
    String password;

    //deep copy constructor
    Students(Students s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];  // deep copy: no changes reflect
        }
    }




    //shallow copy constructor
//    Students(Students s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//
//        //shallow copy : changes reflect
//        this.marks = s1.marks;// reference of the array marks is copied
//    }

    Students(){
        marks = new int[3];
        System.out.println("Constructor is called....");
    }
}