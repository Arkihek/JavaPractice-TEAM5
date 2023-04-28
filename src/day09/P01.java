package day09;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir 20`den kucuk bir sayi giriniz.");
        int sayi = scan.nextInt();
        int carpim = 1;
        System.out.print(sayi+"! = ");
        for (int i = sayi; i >= 1; i--) {
            carpim = i * carpim;
            if (i!=1){
            System.out.print(i + "*");
        }
    } System.out.print("1 = " + carpim);
}
}
