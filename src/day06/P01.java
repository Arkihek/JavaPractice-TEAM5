package day06;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf = scanner.next().charAt(0);

        System.out.println(harf >= 'a' && harf <= 'z' ? Character.toUpperCase(harf) : harf);
    }
}

