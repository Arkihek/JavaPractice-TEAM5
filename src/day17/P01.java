package day17;

import java.util.Scanner;

public class P01 {
    // Bu örnekte yarı çapını kullanıcıdan aldığımız çemberin çevresini hesaplayacağız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cemberin yaricapini giriniz");
        double yaricap = scan.nextDouble();

        double cevre = 2*Math.PI*yaricap;

        System.out.println("Cemberin yaricapi : " + yaricap + " Cemberin cevresi : " +cevre);
    }
}
