import java.io.*;

public class buffInput {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        int umur;
        double tinggi;
        char jenkel;
        boolean status;

        System.out.print("Masukkan nama anda: ");
        nama = input.readLine();
        System.out.print("Masukkan umur anda: ");
        umur = Integer.parseInt(input.readLine());
        System.out.print("Masukkan tinggi anda: ");
        tinggi = Double.parseDouble(input.readLine());
        System.out.print("Masukkan kelamin anda (L/P): ");
        jenkel = (input.readLine()).charAt(0);
        System.out.print("Status: ");
        status = Boolean.parseBoolean(input.readLine());
        System.out.println("-------------------------------------------OUTPUT-------------------------------------------------------");
        System.out.println("Nama: "+nama+"\nUmur: "+umur+"\nTinggi badan: "+tinggi+"\nJenis Kelmin: "+jenkel+"\nstatus: "+status);
    }
}