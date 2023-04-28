package day11;

public class P01 {
    /* 1'den 4'e kadar (4 dahil) olan sayilar icin carpim tablosu olusturun
            1  2  3  4
            2  4  6  8
            3  6  9  12
            4  8  12 16
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }


}
