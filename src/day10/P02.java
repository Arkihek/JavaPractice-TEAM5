package day10;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        //  Kullanicidan pozitif bir tamsayi isteyip,
        //  sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı gırınız");
        int sayi= scan.nextInt();
        boolean asalMi=true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                asalMi=false;
                break;
            }
        }
        if (asalMi){
            System.out.println("sayı asal");
        }else {
            System.out.println("sayı asal sayı değil");
        }
    }
}
