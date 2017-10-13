import java.io.*;

public class segitiga{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double alas, tinggi, sisiMiring, luas, keliling;

        System.out.print("Masukkan alas: ");
        alas = Double.parseDouble(input.readLine());
        System.out.print("Masukkan tinggi: ");
        tinggi = Double.parseDouble(input.readLine());

        luas = 0.5*alas*tinggi;
        sisiMiring=(double)Math.sqrt(Math.pow(0.5*alas,2)+Math.pow(tinggi,2));
        keliling = alas+sisiMiring+sisiMiring;

        System.out.println("--------------HASIL--------------");
        System.out.println("Sisi miring segitiga: "+sisiMiring+" meter");
        System.out.println("Luas segitiga: "+luas+" meter");
        System.out.println("Keliling segitiga: "+keliling+" meter");
    }
}