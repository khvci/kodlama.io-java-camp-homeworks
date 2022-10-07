package week3.odev2.interfaces;

public class MySqlCustomerLayer implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("MySql Eklendi.");
    }
}
