package day01;

import java.util.Scanner;

public class P08 {

    public static void main(String[] args) {
        // Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        // ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scanner.nextDouble();

        System.out.println((byte)(sayi));
    }


}
