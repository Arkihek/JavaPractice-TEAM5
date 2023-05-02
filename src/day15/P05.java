package day15;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P05 {
    /*
        Soru 5-Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOlustur()));
    }

    public static int[] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array boyutunu giriniz : ");
        int boyut = scan.nextInt();

        int[] arr = new int[boyut];

        System.out.println("Lutfen array`in elemanlarini giriniz");
        for (int i = 0; i < arr.length; i++) {
            int kSayi = scan.nextInt();
            arr[i] = kSayi;
        }

        return arr;
    }
}
