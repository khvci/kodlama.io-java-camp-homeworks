package week3.odev2.abstractClasses;

public class Main {
    public static void main(String[] args) {
        GameCalculator[] calculators = new GameCalculator[]{
                new MaleCalculator(), new FemaleCalculator(), new KidsCalculator(), new OlderCalculator()
        };
        for (GameCalculator calculator: calculators) {
            calculator.calculate();
            calculator.gameOver();
        }
    }
}
