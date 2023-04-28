package day01;

import java.util.Scanner;

public class P10 {

        public static void main(String[] args) {

            // Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
            // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen sirasiyla bir ondalikli ve bir tamsayi giriniz. Her degerden sonra enter`a basiniz.");

            double sayi1 = scanner.nextDouble();
            int sayi2 = scanner.nextInt();

            int bolum = (int)(sayi1/sayi2);
            System.out.println(bolum);
        }
    }