import java.io.*;

public class pangkat{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int angka, pangkat, hasil;

        System.out.print("Masukkan angka: ");
        angka = Integer.parseInt(input.readLine());
        System.out.print("Masukkan pangkat: ");
        pangkat = Integer.parseInt(input.readLine());

        hasil=angka;
        for(int i=1;i<pangkat;i++){
            hasil*=angka;
        }
        System.out.print("Hasilnya adalah "+hasil);
    }
}