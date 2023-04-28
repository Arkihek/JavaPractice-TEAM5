package day05;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        // hesaplayin (kilo10000 / (boyboy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vucutKitleEndx = (kilo * 10000) / (boy * boy);

        if (vucutKitleEndx > 30) {
            System.out.println("obez'sin");
        } else if (vucutKitleEndx > 25) {
            System.out.println("Kilolusun");

        } else if (vucutKitleEndx > 20) {
            System.out.println("normal kilon");

        } else {
            System.out.println("Zayıfsın");

        }
    }
}

