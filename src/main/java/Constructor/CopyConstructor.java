package Constructor;

class Manager{
    String region;
    String name;
    int turnOver;
    public void printInfo() {
        System.out.println(this.name +" of " + this.region + " region has turnover of " + this.turnOver + "/-");
    }
    Manager() {

    }
    Manager(Manager manager2) {
        this.region = manager2.region;
        this.name = manager2.name;
        this.turnOver = manager2.turnOver;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.name = "Vishnu Parajapati";
        manager1.turnOver = 3500000;
        manager1.region = "North";

        Manager manager2 = new Manager(manager1);
        manager2.printInfo();
    }
}
