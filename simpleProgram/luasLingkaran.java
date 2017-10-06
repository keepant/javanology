import java.io.*;

public class luasLingkaran{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double jari, luas, phi;
        phi = 3.14;

        System.out.print("Masukkan Jari-jari: ");
        jari = Double.parseDouble(input.readLine());
        
        luas=phi*jari*jari;
        System.out.println("Luas Lingkaran: "+luas+" meter");

    }
}