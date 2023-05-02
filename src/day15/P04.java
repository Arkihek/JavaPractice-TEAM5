package day15;

public class P04 {
    /*
        Soru 4-Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere kullanildigini yazdiran bir method olusturun.
     */
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,11,1,3,1,5};

        kacTaneVar(arr,11);

    }
    public static void kacTaneVar(int[] arr,int element){
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element){
                sayac++;
            }
        }if (sayac > 0){
            System.out.println("Aradiginiz elementten " + sayac + " tane var");
        }else {
            System.out.println("Aradiginiz element bu array`in icinde yok");
        }

    }
}
