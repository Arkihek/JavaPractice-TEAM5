package day02;

import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int tamSayi = scan.nextInt();

        if (tamSayi%5==0){
            System.out.println("Girdiginiz sayi : " + tamSayi + "\nBu sayi 5`in tam kati");
        }else {
            System.out.println("Girdiginiz sayi : " + tamSayi + "\nBu sayi 5`in tam kati degil");
        }


    }


}
