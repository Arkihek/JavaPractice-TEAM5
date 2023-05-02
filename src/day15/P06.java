package day15;

public class P06 {
    /*
    Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
     */

    public static void main(String[] args) {
        String[] arr = {"Ihsan" ,"AYSE" , "Nilufer", "ali"};


        enUzunEnKisa(arr);
    }
    public static void enUzunEnKisa(String[] arr){
        String enUzun = arr[0];
        String enKisa = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (enUzun.length()<arr[i].length()){
                enUzun = arr[i];
            } else if (enKisa.length()>arr[i].length()){
                enKisa = arr[i];
            }
        }
        System.out.println("En uzun element : " + enUzun +
                "\nEn Kisa element : " + enKisa);
    }
}
