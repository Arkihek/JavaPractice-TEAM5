package day09;

import java.util.Scanner;

public class P03 {

    //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
    //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
    //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

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
            System.out.println("uyarı");
        }
    }
}