package day18;

public class P01 {
    /*
    Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
    method olusturun.
     */
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,12}};
        int toplam = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]%2==0){
                    toplam +=array[i][j];
                }

            }
        }
        System.out.println("2 katli bir array’de bulunan cift sayilari toplami : " + toplam);

        

    }
}
