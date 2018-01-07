import java.io.*;

public class barang{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String []namaBarang={"Teh", "Gula", "Mie", "Telur","Beras"};
        int []hargaBarang={3500, 12000, 2000, 1500, 8500};
        int jmlBarang, totalHarga, tampilHarga, totalBelanja=0, bayar;
        String tampilNama;
        char no, konfirm;
        double diskon, jumlahBayar, kembalian;
        
        System.out.println("Daftar barang: ");
        for(int i=0; i<namaBarang.length;i++){
            System.out.println(i+1+". "+namaBarang[i]+"         "+"Rp."+hargaBarang[i]);
        }
        System.out.println("---------------------------------------------------");
        do{
            System.out.print("Masukkan no barang: ");
            no = (input.readLine()).charAt(0);
            if(no=='1'){
                tampilNama=namaBarang[0];
                tampilHarga=hargaBarang[0];
            }else if(no=='2'){
                tampilNama=namaBarang[1];
                tampilHarga=hargaBarang[1];
            }else if(no=='3'){
                tampilNama=namaBarang[2];
                tampilHarga=hargaBarang[2];
            }else if(no=='4'){
                tampilNama=namaBarang[3];
                tampilHarga=hargaBarang[3];
            }else if(no=='5'){
                tampilNama=namaBarang[4];
                tampilHarga=hargaBarang[4];
            }else{
                tampilNama="Maaf barang belum Terdafatr!";
                tampilHarga=0;
            }
        
            System.out.println("Barang : "+tampilNama);
            System.out.println("Harga  : Rp "+tampilHarga);
            System.out.print("Jumlah  : ");
            jmlBarang = Integer.parseInt(input.readLine());
            
            totalHarga=jmlBarang * tampilHarga;
            totalBelanja+=totalHarga;
            System.out.println("Total Harga: Rp"+totalHarga);
            System.out.println("-----------------------------------------");
            System.out.print("Mau nambah? ");
            konfirm = (input.readLine()).charAt(0);
        }while((konfirm=='y') || (konfirm=='Y'));


        if(totalBelanja>=500000){
            diskon=(double)0.15 * totalBelanja;
        } else if(totalBelanja>=250000){
            diskon=(double)0.1 * totalBelanja;
        } else {
            diskon=(double)0.05 * totalBelanja;
        }

        jumlahBayar=(double)totalBelanja-diskon;
        System.out.println("\n-------NOTE-------");
        System.out.println("Jumlah belanja  : Rp "+totalBelanja);
        System.out.println("Diskon          : Rp "+diskon);
        System.out.println("Jumlah Bayar    : Rp "+jumlahBayar);
        System.out.print("Bayar           : Rp ");
        bayar = Integer.parseInt(input.readLine());
        kembalian=bayar-jumlahBayar;
        System.out.println("Kembalian       : Rp "+kembalian);
        System.out.println("\n-----MATURSUWUN-----");
        
    }
}
