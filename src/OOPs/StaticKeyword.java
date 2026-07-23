package OOPs;

class Book{
    int price;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}


public class StaticKeyword {
    public static void main(String[] args){
        System.out.print(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(120);
        System.out.print(Book.count);  // (b2.count) or (b1.count)
    }
}

//we can access static variable using class and object too.
//static variable remains same for all the classes and objects