package week3.odev2.staticDemo;

public class DbHelper {
    //sadece inner class static olabilir.
    public static class Crud {
        public static void delete() {

        }
        public static void update() {

        }
    }

    //Inner class kullanimi best-practicelere uymuyor. Single responsibility cignendigi icin problem yaratabilir.
    public static class Connection {
        public static void createConnection() {

        }
    }
}
