package day01;

import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        // Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        // isleminin sonucununun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki ondalikli sayi giriniz. Her degerden sonra enter`a basiniz.");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        int bolum = (int)(sayi1/sayi2);
        System.out.println(bolum);

    }
}
