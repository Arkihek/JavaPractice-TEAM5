package day05;

import java.util.Scanner;

public class P02 {
    //Soru ) Interview Question
    //Kullanicidan artik yil olup olmadigini kontrol
    //etmek icin yil girmesini isteyin.
    //Kural 1: 4 ile bolunemeyen yillar artik yil
    //degildir
    //Kural 2: 4 ile bolunup 100 ile bolunemeyen
    //yillar artik yildir
    //Kural 3: 4’un kati olmasina ragmen 100 ile
    //bolunebilen yillardan sadece
    //400’un kati olan yillar artik yildir

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int girilenYil = scan.nextInt();

        if (girilenYil % 400 == 0) {
            System.out.println("Artik yildir");
        } else if (girilenYil % 4 == 0 && girilenYil % 100 != 0) {
            System.out.println("Artik yildir");
        } else {
            System.out.println("Artik yil degildir");
        }
    }
}