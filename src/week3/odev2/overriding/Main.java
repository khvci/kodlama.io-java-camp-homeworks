package week3.odev2.overriding;

public class Main {
    public static void main(String[] args) {
        /*
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.calculate(1000));
        .
         */
        BaseKrediManager[] creditManagers = new BaseKrediManager[]{
                new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager creditManager: creditManagers) {
            System.out.println(creditManager.calculate(1000));
        }
    }
}
