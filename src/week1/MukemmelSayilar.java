package week1;

public class MukemmelSayilar {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(5)); // Mukemmel Sayi Degildir yazar
        System.out.println(checkPerfectNumber(-4)); // Gecersiz Sayi yazar
        System.out.println(checkPerfectNumber(28)); // Mukemmel Sayidir yazar

    }

    private static String checkPerfectNumber(int number) {
        if (number < 1) {
            return "Gecersiz Sayi";
        }

        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        return
                total == number ?
                "Mukemmel Sayidir" : "Mukemmel Sayi Degildir";
                //ternary, kisaltilmis if - else.

    }
}
