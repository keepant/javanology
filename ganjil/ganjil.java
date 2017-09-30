import java.util.Scanner;

public class ganjil{
    public static void main (String args[]){
        Scanner bil=new Scanner(System.in);
            System.out.printf("Masukkan Bilangan: ");
            int ganjil=bil.nextInt();
            if(ganjil % 2 == 1){
                System.out.println(ganjil + " Adalah bilangan Ganjil");
            } else {
                System.out.println(ganjil + " Adalah bilangan Genap");
            }
    }
}