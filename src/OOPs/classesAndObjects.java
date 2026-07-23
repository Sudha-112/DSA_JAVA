package OOPs;

class Pen{
    //Pen has some properties and functions
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

public class classesAndObjects {
    public static void main(String[] args){
        //create the object of class pen p1
       // all the objects are created in the Heap
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.tip = 5;
        System.out.println(p1.tip);
    }

}
