package OOPs;

public class MultipleInterface {
    public static void main(String[] args){
        Beer b = new Beer();
        b.eat();
        b.eats();
    }
}

interface Herbivore{
    void eat();
}

interface Carnivore{
    void eats();
}

class Beer implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("Beer eats grass.");
    }

    public void eats() {
        System.out.println("Beer eats meat too.");

    }
}