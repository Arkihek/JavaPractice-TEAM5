package day04;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {


        //  Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer
        //  kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
        //  aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
        //  "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
        //
        //  equals kullanımı

        String tanimliSifre = "Team116";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String kullaniciSifre = scanner.next();

        if (kullaniciSifre.equals(tanimliSifre)) {
            System.out.println("Sifreniz basarili. Giris yapiliyor.");
        } else {
            System.out.println("Sifrenizi yanlis girdiniz. Sifrenizi sifirlamak istiyorsaniz 'E' istemiyorsaniz 'H' harfini giriniz");
            // String sifreSifirlama = scanner.next();
            char sifreSifirlama = scanner.next().charAt(0);
            // if (sifreSifirlama.equalsIgnoreCase("e")) {
            if (Character.toLowerCase(sifreSifirlama) == 'e') {
                System.out.println("Yeni sifrenizi giriniz");
                String yeniSifre = scanner.next();
                if (tanimliSifre.equals(yeniSifre)) { // yeniSifre == tanimliSifre
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz");
                } else {
                    System.out.println("Sifreniz olusturuldu");
                }
            } else {
                System.out.println("Sifre olusturmak istemiyorsunuz");
            }
        }
    }
}
