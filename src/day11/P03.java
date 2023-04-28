package day11;

public class P03 {
    public static void main(String[] args) {
        /*
            verilen bir sayi icin asagidaki tabloyu olusturun
            orn : sayi = 3

            1*1  1*2  1*3
            2*1  2*2  2*3
            3*1  3*2  3*3

         */

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "*" + j + " ");
            }
            System.out.println();
        }
    }
}
