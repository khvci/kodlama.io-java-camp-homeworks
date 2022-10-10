package week3.odev3.core.loggers;

public class HibernateLogger implements Logger {
    @Override
    public void log(String message) {

        System.out.println("Hibernate ile loglandi: " + message);
    }
}
