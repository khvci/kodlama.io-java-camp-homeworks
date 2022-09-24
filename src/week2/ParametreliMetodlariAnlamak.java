package week2;

public class ParametreliMetodlariAnlamak {
    public static void main(String[] args) {
        String message = "Bugun hava cok guzel";
        String newMessage = returnCity();
        System.out.println(newMessage);
        
        int number = add(5, 7);
        System.out.println(number);
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }


    private static String returnCity() {
        return "Ankara";
    }

}
