import java.io.*;

public class pendataanBarang{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        char konfirm;
        int i=0;
        String namaBarang[] = new String[i+1];
        int hargaBarang[] = new int[i+1];
        int jmlBarang[] = new int[i+1];
        int totalHarga=0;
        int totalJml=0;
        double diskon=0;
        double jmlBayar=0;
        int bayar;
        double kembalian=0;

        do{
            System.out.print("Nama barang: ");
            namaBarang[i] = input.readLine();
            System.out.print("Harga barang: ");
            hargaBarang[i] = Integer.parseInt(input.readLine());
            totalHarga+=hargaBarang[i];
            System.out.print("Jumlah barang: ");
            jmlBarang[i] = Integer.parseInt(input.readLine());
            totalJml+=jmlBarang[i];
            System.out.print("Tambah lagi? (Y/T): ");
            konfirm = (input.readLine()).charAt(0);
        
        } while((konfirm == 'Y') || (konfirm == 'y'));

        if(totalHarga>=500000){
            diskon=(double)0.15 * totalHarga;
        } else if(totalHarga>=250000){
            diskon=(double)0.1 * totalHarga;
        } else {
            diskon=(double)0.05 * totalHarga;
        }

        jmlBayar=(double)totalHarga-diskon;
        if((konfirm == 'T') || (konfirm == 't')){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Jumlah Barang: "+totalJml);
            System.out.println("Total Harga: Rp "+totalHarga);
            System.out.println("Diskon: Rp "+diskon);
            System.out.println("Jumlah Bayar: Rp "+jmlBayar);
            System.out.print("Bayar: Rp ");
            bayar = Integer.parseInt(input.readLine());
            kembalian =(double) bayar - jmlBayar;
            System.out.println("Kembalian: Rp "+kembalian);
        }
        
    }
}
