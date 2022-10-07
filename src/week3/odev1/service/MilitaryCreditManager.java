package week3.odev1.service;

public class MilitaryCreditManager extends BaseCreditManager implements CreditManager {

    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandi.");
    }
}
