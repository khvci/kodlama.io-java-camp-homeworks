package week1;

public class KalinInceSesliHarfler {
    public static void main(String[] args) {
        inceMiKalinMi('E'); // Ince Sesli Harf yazar
        inceMiKalinMi('I'); // Kalin Sesli Harf yazar
        inceMiKalinMi('G'); // Sesli Harf Degil yazar
    }

    private static void inceMiKalinMi(char character) {
        switch (character) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin Sesli Harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Ince Sesli Harf");
                break;
            default:
                System.out.println("Sesli Harf Degil");
        }
    }
}
