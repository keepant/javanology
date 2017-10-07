import java.util.Scanner;

public class scanInput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama;
        int umur;
        double tinggi;
        char jenkel;
     //   boolean status;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan umur: ");
        umur = input.nextInt();
        System.out.print("Masukkan tinggi badan: ");
        tinggi = input.nextDouble();
        System.out.print("Masukkan jenis kelamin (L/P): ");
        jenkel = input.next().charAt(0);
     //   System.out.print("Status: ");
       // status = input.nextBoolean();
        System.out.println("-------------------------------------------OUTPUT-------------------------------------------------------");
        System.out.println("Nama: "+nama+"\nUmur: "+umur+"\nTinggi badan: "+tinggi+"\nJenis Kelmin: "+jenkel+"\nstatus: "/*+status*/);
    }
}