import java.io.*;

public class basic{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int nilaiAwal, nilaiAkhir; 
        
        /* System.out.print("Masukkan nilai Awal: ");
        nilaiAwal = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan nilai Akhir: ");
        nilaiAkhir = Integer.parseInt(input.readLine());
        
        int i=nilaiAwal;
        while(i>=nilaiAkhir){
            System.out.println(i);
            i--;
        } */

        int i, n;
        System.out.print("Masukkan banyak perulangan: ");
        n = Integer.parseInt(input.readLine());
        
        i=1;
        while(i<=n){
            System.out.println("Selamat Siang ke -"+i);
            i++;
        }
        System.out.println("--------------------------------------");
        char konfirm;
        konfirm='y';
        i=1;
        while((konfirm=='y') || (konfirm=='Y')){
            System.out.println("Selamat Siang ke-"+i);
            i++;
            System.out.print("Cetak lagi? (Y/T): ");
            konfirm = (input.readLine()).charAt(0);
        }
        System.out.println("--------------------------------------");
        i=1;
        do{
            System.out.println("Selamat Pagi ke-"+i);
            i++;
            System.out.print("Cetak lagi? (Y/T): ");
            konfirm = (input.readLine()).charAt(0);
        } while((konfirm=='y') || (konfirm=='Y'));
    }
}