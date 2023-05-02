package day15;

import java.sql.Array;
import java.util.Arrays;

public class P01 {
    /*
        Soru 1-Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.
     */
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,11};

        System.out.println(Arrays.toString(arr));

        arr = arrArttir(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] arrArttir(int[] arr) {

        int[] yeniArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i] + 2;
        }
        return yeniArr;
    }
}
