package week3.odev2.abstractDemo;

public class SqlServerDbManager extends BaseDbManager {

    @Override
    public void getData() {
        System.out.println("Veri getirildi: Sql Server");
    }
}
