import java.io.*;

public class rataBilangan{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int angka, pembagi=0, hasil=0;
        double rata;
        char jawab;

        do{
            System.out.print("Masukkan Angka: ");
            angka = Integer.parseInt(input.readLine());
            hasil+=angka;
            pembagi++;
            System.out.print("Input lagi?(Y/T): ");
            jawab = (input.readLine()).charAt(0);
        } while((jawab=='y') || (jawab=='Y'));
        rata=(double)hasil/pembagi;
        System.out.println("Hasil Rata-Rata: "+rata);
    }
}