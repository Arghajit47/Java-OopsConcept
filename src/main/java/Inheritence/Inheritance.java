package Inheritence;

class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5*l*h);
    }
}

class Circle extends Shape {
    public void area(int r ) {
        System.out.println(3.14*r*r);
    }
}
class EqTriangle extends Triangle {
    EqTriangle() {
        System.out.println("All sides are equal");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area(10,13);

        EqTriangle eqTriangle = new EqTriangle();
        eqTriangle.area(10,10);

        Circle circle = new Circle();
        circle.area(10);
    }
}
