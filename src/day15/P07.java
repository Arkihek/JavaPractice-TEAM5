package day15;

import java.util.Arrays;

public class P07 {
    /*
    Soru 7-Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin, eski array’e yeni degeri atayin.
     */
    public static void main(String[] args) {
        String[] arr = {"P1","P21","P31","P11","P15"};

        System.out.println(Arrays.toString(arrayElemanEkle(arr, "XD")));


    }

    private static String[] arrayElemanEkle(String[] arr,String eklenecek) {

        String[] yeniarr = new String[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniarr[i] = arr[i];
        }

        yeniarr[yeniarr.length-1] = eklenecek;
        return yeniarr;
    }
}
