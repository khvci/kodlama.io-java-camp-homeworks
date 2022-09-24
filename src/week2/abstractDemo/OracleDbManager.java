package week2.abstractDemo;

public class OracleDbManager extends BaseDbManager{


    @Override
    public void getData() {
        System.out.println("Veri getirildi: Oracle");
    }
}
