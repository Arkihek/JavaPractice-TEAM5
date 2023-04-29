package day13;

public class P04 {
    /*
        Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        donduren bir method olusturun.
     */

    public static void main(String[] args) {
        String str = "Selamlar";
        System.out.println(tersineDondur(str));

    }

    private static String tersineDondur(String str) {
        String empty = "";
        int harfSayisi =str.length()-1;
        while (harfSayisi>=0){
            empty += str.charAt(harfSayisi);
            harfSayisi--;
        }
        return empty;
    }

}
