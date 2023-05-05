package day16;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        /*
            Soru-2) kullanıcının girdiği TL miktarını en az banknot sayısına çeviren programı array kullanarak yapınız.
            int[ ] bankonatlar = {200, 100, 50, 20, 10, 5, 1};
            Örneğin Lütfen Testirlik Maaşınızı TL Olarak Girin: 8642
            Minimum banknot sayısı:
            43 x 200 TL
            2 x 20 TL
            2 x 1 TL
            Toplam Kullanılan Bankonot Sayısı: 47
         */

        int[] banknotlar = {200,100,50,20,10,5,1};
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen testerlik maasinizi TL olarak giriniz");
        int maas = scan.nextInt();
        int sayac = 0;
        for (int i = 0; i < banknotlar.length; i++) {
            sayac += maas/banknotlar[i];
            maas = maas%banknotlar[i];

        }
        System.out.println(sayac);

    }
}
