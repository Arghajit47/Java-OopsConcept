package Abstraction;

abstract class Animal {
    abstract void walk();
    public void eats() {
        System.out.println("Animal eats");
    }
    Animal() {
        System.out.println("Creating a new Animal");
    }
}
class Horse extends Animal{
    Horse() {
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal {
    Chicken() {
        System.out.println("Created a Chicken");
    }
    public void walk() {
        System.out.println("Walk on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();

        Chicken chicken = new Chicken();
        chicken.walk();
    }
}
