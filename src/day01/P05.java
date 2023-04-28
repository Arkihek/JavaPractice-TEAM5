package day01;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz her degerden sonra entera basiniz");
        int sayi1 = scanner.nextInt(); // 15
        int sayi2 = scanner.nextInt(); // 10

        int temp = 0;

        temp = sayi2; // 10
        sayi2 = sayi1; // 15
        sayi1 = temp; // 10

        System.out.println("ilk girdiginiz deger artik : " + sayi1 + "\nikinci girdiginiz deger ise : "+ sayi2);

    }
}
