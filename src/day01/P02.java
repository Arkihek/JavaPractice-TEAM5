package day01;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        // Kullanicidan bir double bir de int sayi alip bunlarin toplamini ve carpimini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla bir ondalikli ve bir tamsayi giriniz her degerden sonra enter`a basiniz");
        double sayi1 = scanner.nextDouble();
        int sayi2 = scanner.nextInt();

        System.out.println("Sayirilarin toplami : " + (sayi1 + sayi2) + "\nSayilarin carpimi : " + (sayi1*sayi2));
    }
}
