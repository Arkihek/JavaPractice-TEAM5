package day18;

public class P05 {
    /*
        Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        toplaminini yazdiran bir method olusturun.
     */
    public static void main(String[] args) {
        int[][] arr = {{13},{3, 4, 5}, {2, 3, 6, 7}};
        System.out.println("arrSonElemanTopla(arr) = " + arrSonElemanTopla(arr));

    }

    public static int arrSonElemanTopla(int[][] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i][arr[i].length-1];
        }
        return toplam;
    }

}
