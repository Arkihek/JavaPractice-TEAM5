package day17;

public class P05 {
    /*
    Girilen 2 sayıyı 3.bir değişken kullanmadan değerlerini değiştirme
     */
    public static void main(String[] args) {
        int sayi1 = 15;
        int sayi2 = 20;

       // sayi1 = sayi1 ^ sayi2; XOR operatörü
       // sayi2 = sayi1 ^ sayi2; XOR operatörü
       // sayi1 = sayi1 ^ sayi2; XOR operatörü
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

    }
}
