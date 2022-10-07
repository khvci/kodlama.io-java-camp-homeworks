package week3.odev2.polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Logged to Console: " + message);
    }
}
