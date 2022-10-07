package week3.odev2.abstractDemo;

public class CustomerManager {
    BaseDbManager dbManager;
    public CustomerManager(BaseDbManager dbManager) {
        this.dbManager = dbManager;
    }

    public void getCustomers() {
        this.dbManager.getData();
    }
}
