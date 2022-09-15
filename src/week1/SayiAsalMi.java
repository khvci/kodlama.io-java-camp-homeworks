package week1;

public class SayiAsalMi {
    public static void main(String[] args) {
        int number = 7;
        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; //bolunebildigi bir sayi bulunca for dongusune devam etmeye gerek yok
                }
            }
        }

        if (number > 0) {
            System.out.println(
                    isPrime ? "Asal Sayi" : "Asal Sayi Degil" //ternary, kisaltilmis if-else
            );
        } else {
            System.out.println("Gecersiz Sayi");
        }

    }
}
