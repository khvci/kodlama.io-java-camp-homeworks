package week1;

public class ArkadasSayilar {
    public static void main(String[] args) {
        areFriendlyNumbers(220, 284); // bu iki sayi arkadastir
        areFriendlyNumbers(220, 285); // bu iki sayi arkadas degildir
    }

    private static void areFriendlyNumbers(int num1, int num2) {
        System.out.println(
                dividersSum(num1) == num2 && dividersSum(num2) == num1 ?
                        "bu iki sayi arkadastir" :
                        "bu iki sayi arkadas degildir"
        );

    }
    private static int dividersSum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }
}


