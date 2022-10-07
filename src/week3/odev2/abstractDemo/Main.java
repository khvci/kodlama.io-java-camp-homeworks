package week3.odev2.abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlDbManager());
        customerManager.getCustomers();
    }
}
