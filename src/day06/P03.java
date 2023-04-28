package day06;

import java.util.Scanner;

public class P03 {
        // Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println("lutfen bir sayi giriniz");
            int sayi1= scan.nextInt();
            System.out.println(sayi1>0 ? sayi1 : sayi1*(-1) );
        }
    }

