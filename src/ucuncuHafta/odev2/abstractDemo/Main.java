package ucuncuHafta.odev2.abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new PostgreSqlManager();

        customerManager.getCustomer();
    }
}
