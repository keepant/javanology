import java.io.*;

public class basic{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int nilaiAwal, nilaiAkhir; 
        
        System.out.print("Masukkan nilai Awal: ");
        nilaiAwal = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan nilai Akhir: ");
        nilaiAkhir = Integer.parseInt(input.readLine());
        
        int i=nilaiAwal;
        while(i>=nilaiAkhir){
            System.out.println(i);
            i--;
            
        }
    }
}