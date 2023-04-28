package day06;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kontrol etmek üzere 3 kenar uzunlugu gırınız");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        System.out.println(kenar1==kenar2 && kenar1==kenar3 ? "eşkenar üçgen" : " eşkenar üçgen değil");
    }
}
