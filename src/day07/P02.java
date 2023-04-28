package day07;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        //Soru 2-Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Lutfen iki basamakli bir sayi girin");
        // int ikiBasamakli = scan.nextInt();

        // int birlerBasamagi = ikiBasamakli%10;
        // int onlarBasamagi = ikiBasamakli/10;

        // String strBirlerBasamagi ="";
        // String strOnlarBasamagi = "";

        // switch (onlarBasamagi){
        //     case 1:
        //         strOnlarBasamagi = "On";
        //         break;
        // }
        // switch (birlerBasamagi){
        //     case 1 :
        //         strBirlerBasamagi = "bir";
        //         break;


        // }
        // System.out.println(strOnlarBasamagi+strBirlerBasamagi);


        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yaziyla goruntulemek istediginiz tam sayiyi giriniz:");
        int girilenSayi = scanner.nextInt();
        if (girilenSayi < -100 || (girilenSayi > -10 && girilenSayi < 10) || girilenSayi > 100)
            System.out.println("Iki basamakli bir tam sayi girmediniz.");
        else {
            if (girilenSayi < 0) {
                System.out.print("Eksi ");
                girilenSayi *= -1;
            }
            switch (girilenSayi / 10) {
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }
            switch (girilenSayi % 10) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("Dokuz");
                    break;
            }
        }
    }
}