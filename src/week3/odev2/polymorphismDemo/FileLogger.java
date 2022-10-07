package week3.odev2.polymorphismDemo;

public class FileLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Logged to File: " + message);
    }
}
