package day17;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        /*
        kullanıcıdan ürünün KDV’siz değerini alacağız.
        Sonrasında ürünün KDV’li fiyatını hesaplayıp ekrana yazdıracağız.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the product price : ");
        int fiyat = scan.nextInt();
        System.out.println("The price of the product without KDV is " + fiyat + " TL and the price with KDV is " + fiyat*108/100);

    }
}
