package day09;

import java.util.Scanner;

public class P05 {

    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scan.nextLine();


        if (isim.length() > soyisim.length()) {
            System.out.print(isim.toUpperCase().charAt(0) + isim.substring(1).toLowerCase());
            System.out.print(" ");
            System.out.println(soyisim.toUpperCase().charAt(0) + soyisim.substring(1).toLowerCase());
        } else if (isim.length() < soyisim.length()) {
            System.out.print(isim.toUpperCase().charAt(0) + isim.substring(1).toLowerCase());
            System.out.print(" ");
            System.out.println(soyisim.toUpperCase());
        }
    }
}
