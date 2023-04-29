package day13;

import java.util.Scanner;

public class P05 {
    /*
        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu negatif sayiyi sayi adedine ve toplama eklemeyin
     */


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int sayi = 1;
            int toplam = 0;
            int sayiAdedi = 0;

            while (sayi!=0) {
                System.out.print("Lütfen pozitif bir tam sayı girin (Bitirmek için 0'a basın): ");
                sayi = scanner.nextInt();

                if (sayi < 0) {
                    System.out.println("Negatif sayı kullanamazsınız!");
                }else if (sayi == 0) {
                    break;
                }
                toplam += sayi;
                sayiAdedi++;
            }

            System.out.println("Girdiğiniz " + sayiAdedi + " adet pozitif tam sayının toplamı: " + toplam);
        }
    }


