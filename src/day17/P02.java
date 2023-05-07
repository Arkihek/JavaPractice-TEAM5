package day17;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*
        kullanıcıya gitmek istediği mesafeyi ve kaç
        saatte gitmek istediğini soracağız.
        Bu bilgilere göre saatte ortalama kaç km hız ile gitmesi gerektiğini ekrana yazdıracağız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Gitmek istediginiz mesafayi km cinsinden giriniz");
        int mesafe = scan.nextInt();
        System.out.println("Kac saatte gitmek istediginizi giriniz");
        double zaman = scan.nextInt();
        double hiz = mesafe / zaman;
        System.out.println("Saatte ortalama " + hiz + " km/s hiz ile gitmeniz gerekiyor");


    }
}
