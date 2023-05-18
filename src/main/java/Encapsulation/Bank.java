package Encapsulation;

class Account {
    public String name;
    int age;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "Arghajit Singha";
        account.age = 35;
        account.email = "abc@gmail.com";
        account.setPassword("abcd@1234");
        System.out.println(account.getPassword());
    }
}
