package org.example.java;

class Pen {
    String color;
    String name;
    String type;
    public void write() {
        System.out.println("Writing Something with " + this.name);
    }
    public void penColor() {
        System.out.println("Pen Color is: " + this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();

        pen1.color = "Blue";
        pen1.name = "Pen1";
        pen1.type = "Ballpoint";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.name = "Pen2";
        pen2.type = "Gel";

        pen1.write();
        pen2.write();

        pen1.penColor();
        pen2.penColor();

        Student student = new Student();
        student.name = "Pbitra Prabhakar";
        student.age = 24;

        student.printInfo();
    }
}
