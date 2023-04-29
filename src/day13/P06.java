package day13;

import java.util.Scanner;

public class P06 {
    /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi ve bir uslu ifade giriniz");
        int sayi = scan.nextInt();
        int usluSayi = scan.nextInt();

        sayininUssunuHesapla(sayi, usluSayi);
    }

    public static void sayininUssunuHesapla(int sayi, int usluSayi) {

        int sonucSayi = 1;

        while (usluSayi >= 1) {

            sonucSayi *= sayi;
            usluSayi--;

        }
        System.out.println("Uslu ifadesi hesaplanmis sonucunuz : " + sonucSayi);
    }
/*
public static void sayininUssunuHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi ve bir uslu ifade giriniz");
        int sayi = scan.nextInt();
        int usluSayi = scan.nextInt();

        int sonucSayi = 1;

        while (usluSayi>=1){

            sonucSayi*=sayi;
            usluSayi--;

        }
        System.out.println("Uslu ifadesi hesaplanmis sonucunuz : " + sonucSayi);
    }
 */ // Bu da method icinde scanner komutlu cozum.

}
