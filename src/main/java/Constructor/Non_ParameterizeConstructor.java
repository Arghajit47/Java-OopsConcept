package Constructor;

class Student{
    String name;
    int age;
    boolean status;     //Present: true, Absent: false

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.status);
    }

    Student() {
        System.out.println("Calling Non parameterize Constructor");
    }
}

public class Non_ParameterizeConstructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Arghajit Singha";
        student1.age = 24;
        student1.status = true;
        student1.printInfo();
    }
}
