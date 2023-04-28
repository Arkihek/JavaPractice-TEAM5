package day01;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        // Kullanicidan ve 3 farkli data turunde deger alip, girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen uc farkli data turunu sirayla giriniz ve her degerden sonra enter`a basiniz");
        System.out.println("Lutfen string bir ifade giriniz ");
        String str = scanner.next();
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        System.out.println("Lutfen ondalikli bir sayi giriniz");
        double ondalikli = scanner.nextDouble();

        System.out.println("String ifadeniz : " + str + "\ninteger ifadeniz : " + sayi + "\ndouble ifadeniz : " + ondalikli);

    }
}
