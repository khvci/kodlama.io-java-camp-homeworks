package week1;

public class EnBuyukSayi {
    public static void main(String[] args) {
        /* sayilari array icinde tutarsak kac tane olurlarsa olsunlar
           for dongusu ile kolayca hepsini kontrol edebiliriz */
        int[] numaralar = {266, 25, 269};

        int enBuyuk = numaralar[0]; //baslangicta ilk eleman en buyuk

        for (int i:numaralar) {
            //tum elemanlar uzerinden gecerek daha buyuk bir sayi buldugumuzda enBuyuk degiskenini guncelliyoruz
            if (i > enBuyuk) enBuyuk = i;
        }

        System.out.println(enBuyuk);
    }
}
