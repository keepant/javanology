import java.io.BufferedReader;
import java.io.InputStreamReader;

public class luasPersegiPanjang{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double panjang, lebar, luas;

        System.out.print("Masukkan Panjang (m): ");
        panjang = Double.parseDouble(input.readLine());
        System.out.print("Masukkan Lebar (m): ");
        lebar = Double.parseDouble(input.readLine());

        luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang: "+luas+ " meter");
    }
}