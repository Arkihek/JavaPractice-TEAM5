package day02;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not >= 50 && not <= 100) {
            System.out.println("Sinifi gectiniz");
        } else if (not >= 0 && not < 50) {
            System.out.println("Malesef kaldin");
        } else {
            System.out.println("Hatali giris yaptiniz");
        }
    }
}
