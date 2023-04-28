package day09;

import java.util.Scanner;

public class P04 {

    // Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
    //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
    //baslangic degerinden kucuk olsa da program calissin

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir baslangıc girisi yapınız");
        int bas = scanner.nextInt();
        System.out.println("lutfen bir bitis girisi yapınız");
        int bit = scanner.nextInt();
        int toplam = 0;
        if (bit > bas) {
            for (int i = bas; i <= bit; i++) {

                toplam += i;


            }
            System.out.println("sayıların toplamı :  " + toplam);
        } else {
            for (int i = bit; i <= bas; i++) {
                toplam = toplam + i;

            }
            System.out.println("sayıların toplamı :  " + toplam);
        }
    }
}
