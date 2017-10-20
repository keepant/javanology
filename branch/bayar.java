import java.io.*;

public class bayar{
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double diskon, totalHarga, bayar;

        System.out.print("Masukkan total harga: ");
        totalHarga = Double.parseDouble(input.readLine());

        if(totalHarga>=100000){
            diskon=0.1*totalHarga;
        } else if(totalHarga>=50000){
            diskon=0.05*totalHarga;
        } else {
            diskon=0;
        }
        bayar=totalHarga-diskon;
        System.out.println("Total Harga: "+totalHarga);
        System.out.println("Diskon: "+diskon);
        System.out.println("Total Bayar: "+bayar);

    }
}