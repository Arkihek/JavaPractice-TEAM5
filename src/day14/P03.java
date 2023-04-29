package day14;

import java.util.Scanner;

public class P03 {
    /*
        Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        bulunuz, tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();
        boolean tamKare = false;
        int karekok = 1;

        do {
            if (sayi == karekok * karekok) {
                tamKare = true;
                break;
            }
            karekok++;
        } while (sayi >= karekok * karekok);

        System.out.println(tamKare);

    }

}
