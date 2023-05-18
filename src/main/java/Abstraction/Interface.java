package Abstraction;
interface pets {
    public void walks();
     public void plays();
    public void eats();

}
interface Friendly {
    void friendly();
}

class Dog implements pets, Friendly {
    public void walks() {
        System.out.println("Walk on 4 legs");
    }

    @Override
    public void plays() {

    }

    @Override
    public void eats() {

    }

    @Override
    public void friendly() {

            System.out.println("They are very friendly");

    }
}
public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walks();
        dog.friendly();
    }
}
