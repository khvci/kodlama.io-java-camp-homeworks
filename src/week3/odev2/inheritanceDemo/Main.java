package week3.odev2.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //ogretmenKrediManager.calculate();

        KrediUI krediUI = new KrediUI();
        krediUI.calculateLoan(ogretmenKrediManager);
        krediUI.calculateLoan(new AskerKrediManager());
    }
}
