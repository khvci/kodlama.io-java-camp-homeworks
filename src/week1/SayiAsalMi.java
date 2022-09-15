package week1;

public class SayiAsalMi {
    public static void main(String[] args) {
        isPrime(-1); // Gecersiz Sayi yazar
        isPrime(0); // Asal Sayi Degil yazar
        isPrime(1); // Asal Sayi yazar
        isPrime(2); // Asal Sayi yazar
        isPrime(3); // Asal Sayi yazar
        isPrime(4); // Asal Sayi Degil yazar

    }

    private static void isPrime(int number) {
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
