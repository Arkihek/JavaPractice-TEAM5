package day17;

public class P04 {
    public static void main(String[] args) {
        /*
           Girilen İki Sayının Değerlerini Değiştirme
         */

        int sayi1 = 15;
        int sayi2 = 20;
        int temp;

        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

    }
}
