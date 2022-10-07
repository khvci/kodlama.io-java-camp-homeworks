package week3.odev2.overriding;

public class OgrenciKrediManager extends BaseKrediManager {
    @Override
    public double calculate(double amount) {
        return amount * 1.1;
    }
}
