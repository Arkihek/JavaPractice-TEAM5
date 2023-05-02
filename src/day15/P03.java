package day15;

import java.util.Arrays;

public class P03 {
    /*
        Soru 3-Verilen bir array’deki tum elementleri bir saga kaydirip,
        sondaki elementi de basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
     */

    public static void main(String[] args) {
        int[] arr = {1,5,2,15};

        System.out.println(Arrays.toString(arrKaydir(arr)));
    }

    private static int[] arrKaydir(int[] arr) {
        int sonIndex = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0]=sonIndex;
        return arr;
    }
}
