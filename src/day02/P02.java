package day02;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char ilkHarf = scanner.next().charAt(0);
        if (ilkHarf == 'o' || ilkHarf == 'O') {
            System.out.println("Ocak");
        }
        if (ilkHarf == 's' || ilkHarf == 'S') {
            System.out.println("Subat");
        }
        if (ilkHarf == 'm' || ilkHarf == 'M') {
            System.out.println("Mart");
        }
        if (ilkHarf == 'n' || ilkHarf == 'N') {
            System.out.println("Nisan");
        }
        if (ilkHarf == 'm' || ilkHarf == 'M') {
            System.out.println("Mayis");
        }
        if (ilkHarf == 'h' || ilkHarf == 'H') {
            System.out.println("Haziran");
        }
        if (ilkHarf == 't' || ilkHarf == 'T') {
            System.out.println("Temmuz");
        }
        if (ilkHarf == 'a' || ilkHarf == 'A') {
            System.out.println("Agustos");
        }
        if (ilkHarf == 'e' || ilkHarf == 'E') {
            System.out.println("Eylul");
        }
        if (ilkHarf == 'e' || ilkHarf == 'E') {
            System.out.println("Ekim");
        }
        if (ilkHarf == 'k' || ilkHarf == 'K') {
            System.out.println("Kasim");
        }
        if (ilkHarf == 'a' || ilkHarf == 'A') {
            System.out.println("Aralik");
        }
        else {
            System.out.println("Hatali giris yaptiniz");
        }
    }
}
