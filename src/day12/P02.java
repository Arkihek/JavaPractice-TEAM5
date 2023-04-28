package day12;

public class P02 {
    // Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

    public static void main(String[] args) {
        System.out.println(girilenIsmiDondur("cemİL", "ceTiN"));

    }

    public static String girilenIsmiDondur(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();

        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        String fullName = isim + " " + soyisim;
        return fullName;
    }
}
