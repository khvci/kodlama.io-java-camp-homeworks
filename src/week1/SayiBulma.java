package week1;

public class SayiBulma {
    public static void main(String[] args) {
        int[] numbers = {1,2,5,7,9,0,-7};
        findNumber(5, numbers); // Sayi mevcuttur yazar
        findNumber(15, numbers); // Sayi mevcut degildir yazar
        findNumber(-7, numbers); // Sayi mevcuttur yazar
    }

    private static void findNumber(int num, int[] numbers) {
        boolean isFound = false;
        for (int i:numbers) {
            if (i == num) {
                isFound = true;
                break;
            }
        }
        System.out.println(
                isFound ? "Sayi mevcuttur" : "Sayi mevcut degildir"
        ); //ternary, kisaltilmis if-else.
    }
}
