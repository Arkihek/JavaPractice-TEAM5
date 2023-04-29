import java.util.Scanner;

public class P02 {

    //  Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    //kontrol edin ve sifredeki hatalari yazdirin.
    //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
    //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
    //- Sifre kucuk harf icermelidir
    //- Sifre buyuk harf icermelidir
    //- Sifre ozel karakter icermelidir
    //- Sifre en az 8 karakter olmalidir.

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    String sifre;
    boolean sifreDogruMu = false;
        do {
        System.out.print("Lutfen bir sifre girin: ");
        sifre = scanner.nextLine();

        boolean kucukHarfMi = false;
        boolean buyukHarfMi = false;
        boolean ozelKarakterMi = false;

        if (sifre.length() >= 8) {
            for (int i = 0; i < sifre.length(); i++) {
                char c = sifre.charAt(i);
                if (Character.isLowerCase(c)) {
                    kucukHarfMi = true;
                } else if (Character.isUpperCase(c)) {
                    buyukHarfMi = true;
                } else if ("!@#$%^&*()_+-=[]{}|;:,.<>/?".indexOf(c) != -1) {
                    ozelKarakterMi = true;
                }
            }
            if (kucukHarfMi && buyukHarfMi && ozelKarakterMi) {
                sifreDogruMu = true;
            } else {
                if (!kucukHarfMi) {
                    System.out.println("Sifreniz kucuk harf icermelidir.");
                }
                if (!buyukHarfMi) {
                    System.out.println("Sifreniz buyuk harf icermelidir.");
                }
                if (!ozelKarakterMi) {
                    System.out.println("Sifreniz ozel karakter icermelidir.");
                }
            }
        } else {
            System.out.println("Sifreniz en az 8 karakter olmalidir.");
        }
    } while(!sifreDogruMu);
        System.out.println("Sifreniz Kabul edilmistir.");

}
}

