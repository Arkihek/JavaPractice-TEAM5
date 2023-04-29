package day13;

import java.util.Scanner;

public class P03 {
    /*
        Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scan.nextInt();
        int rakam = 0;
        int toplam = 0;

        while (sayi!=0){

            rakam = sayi%10; // sayının son basamağını buluyoruz
            toplam += rakam; // rakam değişkenini toplama ekliyoruz
            sayi/=10; // sayının son basamağını atıyoruz
        }
        System.out.println(toplam);
    }

}
