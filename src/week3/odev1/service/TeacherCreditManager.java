package week3.odev1.service;

public class TeacherCreditManager extends BaseCreditManager implements CreditManager {

    @Override
    public void calculate() {
        System.out.println("Ogretmen kredisi hesaplandi.");
    }

}
