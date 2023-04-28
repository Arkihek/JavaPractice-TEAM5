package day03;

public class P01 {
    /* Verilen bir metindeki
      - Büyük harf, küçük harf ve space sayılarını bulunuz.
      - Space sayısını göz önüne alarak kaç kelime olduğunu,
      - Kaç tane büyük harf, kaç tane küçük harf olduğunu yazdırınız.
     */
    public static void main(String[] args) {

        String metin = "Team Bes Calismasi ucuncu gun";
        int buyukHarf= 0;
        int kucukHarf =0;
        int boslukSayisi = 0;
        int boslukSayisi2 = 0;
        for (int i = 0; i < (metin.length()-1); i++) {
            char karakter = metin.charAt(i);
            if (Character.isUpperCase(karakter)){
                buyukHarf++;
            } else if (Character.isLowerCase(karakter)) {
                kucukHarf++;
            } else if (karakter == ' '){
                boslukSayisi++;
            }
        }

        int kelimeSayisi = boslukSayisi+1;

        System.out.println("Buyuk harf sayisi : " + buyukHarf + "\nKucuk harf sayisi : " + kucukHarf + "\nKelime sayisi : " + kelimeSayisi);

    }
}
