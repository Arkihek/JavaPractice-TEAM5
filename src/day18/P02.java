package day18;

import java.sql.Array;
import java.util.Arrays;

public class P02 {
    /*
    Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
    olusturacagimiz tek katli bir array’e bu toplamlari atayin.
    input : int[][] arr = {{3,4,5}, {2,3,6,7}};
    output: [5, 7, 11]
     */
    public static void main(String[] args) {
        int[][] arr = {{3, 4}, {3, 4, 5}, {2, 3, 6, 7}};
        int uzunluk = Math.min(arr[0].length, arr[arr.length - 1].length);
        System.out.println(uzunluk);

        int[] arrYeni = new int[uzunluk];
        System.out.println(Arrays.toString(arrYeni));

        for (int i = 0; i < arr.length; i++) {
            int toplam = 0;
            for (int j = 0; j < arr[i].length; j++) {
                toplam +=arr[i][j];

            }arrYeni[i] += toplam;
        }
        System.out.println(Arrays.toString(arrYeni));
    }


}

