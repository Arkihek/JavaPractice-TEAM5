package day12;

public class P04 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenleri sayisini bulup bize donduren bir method olusturun.

        System.out.println(tamBolenlerSayisi(10)); // 1 - 2 - 5 - 10
        System.out.println(tamBolenlerSayisi(5)); // 2

        System.out.println(tamBolenler(10)); // 1 2 5 10

    }

    public static int tamBolenlerSayisi(int sayi) {
        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        return sayac;
    }

    public static String tamBolenler(int sayi) {
        String tamBolenler = "";
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                tamBolenler += i + " ";
            }
        }
        return tamBolenler;
    }
}
