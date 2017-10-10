import java.io.*;

public class rataBerbobot{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double nilaiMat, nilaiAlgo, rata;

        System.out.print("Masukkan Nilai Matematika: ");
        nilaiMat = Double.parseDouble(input.readLine());
        System.out.print("Masukkan Nilai Algoritma: ");
        nilaiAlgo = Double.parseDouble(input.readLine());

        rata = (nilaiMat*2+nilaiAlgo*3)/5;
        System.out.println("Nilai Rata-rata berbobot: "+rata);
    }
}