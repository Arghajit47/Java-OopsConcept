package Constructor;

class Employee{
    String name;
    int age;
    boolean status;     //Present: true, Absent: false

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.status);
    }

    Employee(String name, int age, boolean status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }
}

public class ParameterizeConstructor {
    public static void main(String[] args) {
        Employee employee = new Employee("Prithvi Shaw", 25, false);
        employee.printInfo();
    }
}
