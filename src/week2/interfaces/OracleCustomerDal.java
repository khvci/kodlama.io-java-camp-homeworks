package week2.interfaces;

public class OracleCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("Oracle eklendi.");
    }
}
