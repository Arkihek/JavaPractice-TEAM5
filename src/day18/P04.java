package day18;

public class P04 {
    /*
        Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        method olusturun.
     */

    public static void main(String[] args) {
        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};
        System.out.println("arrCarpim(arr) = " + arrCarpim(arr));

    }
    public static int arrCarpim(int[][] arr){
        int carpim =1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim *= arr[i][j];
            }
        }
        return carpim;
    }
}
