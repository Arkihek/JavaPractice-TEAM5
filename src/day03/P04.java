package day03;

import java.util.Scanner;

public class P04 {


    // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
    // yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
    // olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Cinsiyetinizi giriniz");


        char cinsiyet = scanner.next().charAt(0);


        System.out.println("yasinizi giriniz");

        int yas = scanner.nextInt();

        if ((cinsiyet == 'k' || cinsiyet == 'K') && yas >= 60) {
            System.out.println("Emkeli olabilrisiniz");


        } else if ((cinsiyet == 'e' || cinsiyet == 'E') && yas >= 65) {

            System.out.println("Emkli olabilirsin");

        } else {

            if ((cinsiyet == 'k' || cinsiyet == 'K')) {
                System.out.println("Kalan yil: " + (60 - yas));


            } else {
                System.out.println("Kalan yil:" + (65 - yas));
            }


        }
    }
}

