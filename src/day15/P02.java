package day15;

public class P02 {
    /*
         Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
     */

    public static void main(String[] args) {

        int[] arr = {1, 4, -8, 12, -6, 13};

        System.out.println(pozitifArrayTopla(arr));

    }

    private static int pozitifArrayTopla(int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                toplam += arr[i];
            }
        }
        return toplam;
    }
}
