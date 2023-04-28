package day01;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdortgeninin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin bir kenarini giriniz");
        int kenar1 = scanner.nextInt();
        System.out.println("Lutfen dikdortgenin ikinci kenarini giriniz");
        int kenar2 = scanner.nextInt();

        System.out.println("Dikdortgeninizin alani : " +( kenar1*kenar2));
    }
}
