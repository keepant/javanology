import java.io.*;

public class totalBayar{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double diskonA, diskonB, bayar, bayarA, bayarB, totalA, totalB;
        int jmlA, jmlB;
        int barangA=1000;
        int barangB=2000;

        System.out.print("Jumlah barang A: ");
        jmlA = Integer.parseInt(input.readLine());
        System.out.print("Jumlah barang B: ");
        jmlB = Integer.parseInt(input.readLine());

        totalA=jmlA*barangA;
        totalB=jmlB*barangB;
        diskonA=totalA*0.10;
        diskonB=totalB*0.05;

        bayarA=totalA-diskonA;
        bayarB=totalB-diskonB;
        bayar=bayarA+bayarB;
        System.out.println("Total bayar: Rp. "+bayar);
        
    }
}