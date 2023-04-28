package day05;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km cinsinden giriniz");
        double girilenMesafe = scanner.nextDouble();
        System.out.println("Cevirmek istediginiz birimi giriniz");
        String birimDegisikligi = scanner.next();

        if (birimDegisikligi.equalsIgnoreCase("metre")) {
            System.out.println(girilenMesafe * 1000);
        } else if (birimDegisikligi.equalsIgnoreCase("santimetre")) {
            System.out.println(girilenMesafe * 1000 * 100);
        } else {
            System.out.println("Istediginiz birim sisteme kayitli degildir");
        }
    }
}

