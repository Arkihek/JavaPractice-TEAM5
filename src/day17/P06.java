package day17;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        /*
         kullanıcıdan aldığımız 2 sayıyı birbirine göre karşılaştırıp eşit, büyük, küçük olma durumlarını ekrana yazdıracağız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen karsilastirmak istediginiz 1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("Lutfen karsilastirmak istediginiz 2. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        if (sayi1 == sayi2){
            System.out.println("Girilen iki sayi birbirine esittir");
        } else if (sayi1>sayi2) {
            System.out.println("1. sayi 2. sayidan daha buyuktur.");
        }else {
            System.out.println("2. sayi 1. sayidan daha buyuktur.");
        }


    }
}
