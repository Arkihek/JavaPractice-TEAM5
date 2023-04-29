package day14;

public class P01 {

     /*
         k harfinden t harfine kadar harfleri yazdirin
     */

    public static void main(String[] args) {
        char harf = 'k';

        do {
            System.out.print(harf + " ");
            harf++;
        }while (harf<='t');
    }
}
