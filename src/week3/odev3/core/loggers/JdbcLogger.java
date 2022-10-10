package week3.odev3.core.loggers;

public class JdbcLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Jdbc ile loglandi: " + message);
    }
}
