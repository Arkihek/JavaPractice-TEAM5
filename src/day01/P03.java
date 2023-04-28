package day01;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        // Kullanicidan ismini, soyismini ve yasini alip assagidaki formatta yazdiriniz
        // Isminiz : Ihsan
        // Soyisminiz : Yilmaz
        // Yasiniz : 28
        // Kaydiniz basariyla tamamlanmamistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisiminizi giriniz");
        String soyisim = scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();
        System.out.println("Isminiz : " + isim + "\nSoyisminiz : " + soyisim + "\nYasiniz : "+ yas + "\nKaydiniz basariyla tamamlanmistir.");
    }
}
