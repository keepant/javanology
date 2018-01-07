import java.io.*;
public class luasLing{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
        int jari;
        double luas;

        System.out.print("Masukkan jari-jari: ");
        jari = Integer.parseInt(input.readLine());
        luas=hitungLuas(jari);
        System.out.println("Luas Lingkaran: "+luas);
    }

    public static double hitungLuas(int r){
        double hasil=(double)22/7*Math.pow(r, 2);
        return hasil;
    }
}