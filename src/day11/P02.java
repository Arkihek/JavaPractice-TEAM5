package day11;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
         /*
            verilen satir ve sutun sayisina uygun olarak
            asagidaki sekli yazdirin

            ornek : satir 4 , sutun 5

                * * * * *
                * * * * *
                * * * * *
                * * * * *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk once satir sonra sutun sayisini giriniz");
        int satir = scan.nextInt();
        int sutun = scan.nextInt();

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= sutun; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

