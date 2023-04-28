package day02;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 3 == 0) {
            System.out.println("3 ile bolunebilen sayi");
        }
        if (sayi % 5 == 0) {
            System.out.println("5 ile bolunebilen sayi");
        } else {
            System.out.println("Hatali giris yaptiniz");
        }

    }
}
