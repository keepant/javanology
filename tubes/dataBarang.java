import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class dataBarang{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        menu();       
    }

    public static void menu() throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        char noMenu;
        String [] namaBarang={"Beras","Teh","Gula","Mie"};
        Integer [] hargaBarang={8500, 2500, 11000, 3000};
        String [] satuanBarang={"kg", "pcs", "kg", "pcs"};
        System.out.println("--------------------------MENU------------------------");
        System.out.println("1. Input barang \n2. Pencarian barang \n3. Harga max barang \n4. Pembelian barang \n5. Keluar");
        System.out.print("Masukkan no menu: ");
        noMenu = (input.readLine()).charAt(0);
        System.out.println(" ");
        if(noMenu=='1'){
            System.out.println("-----------INPUT BARANG----------");
            inputBarang(namaBarang, hargaBarang, satuanBarang);
        } else if(noMenu=='2'){
            System.out.println("---------PENCARIAN BARANG----------");
            cariBarang(namaBarang, hargaBarang, satuanBarang);
        } else if(noMenu=='3'){
            System.out.println("-----------HARGA BARANG----------");
            maxBarang(namaBarang, hargaBarang, satuanBarang);
        } else if(noMenu=='4'){
            System.out.println("---------PEMBELIAN BARANG----------");
            pembelianBarang(namaBarang, hargaBarang, satuanBarang);
        } else if(noMenu=='5'){
            System.out.println("-----------MATUR SUWUN----------");
            System.exit(0);
        } else{
             System.out.println("Menu tidak tersedia!");
        }
    }

    public static void inputBarang(String [] nama, Integer [] harga, String [] satuan) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        char konfirm;
        
        ArrayList<String> listNama = new ArrayList<String>(Arrays.asList(nama));
        ArrayList<Integer> listHarga = new ArrayList<Integer>(Arrays.asList(harga));
        ArrayList<String> listSatuan = new ArrayList<String>(Arrays.asList(satuan));
        String tempNama;
        int tempHarga;
        String tempSatuan;
        int i=4;
        do{
            System.out.print("Nama barang\t: ");
            tempNama = input.readLine();
            listNama.add(tempNama); 
           
            System.out.print("Harga barang\t: ");
            tempHarga = Integer.parseInt(input.readLine());
            listHarga.add(tempHarga);

            System.out.print("Satuan barang\t: ");
            tempSatuan = input.readLine();
            listSatuan.add(tempSatuan);

            i++;
            System.out.print("Input lagi? (Y/N): ");
            konfirm=(input.readLine()).charAt(0);
            
        }while((konfirm=='Y') || (konfirm=='y'));
        
        String [] arrayNama = listNama.toArray(new String[listNama.size()]);
        nama=arrayNama;
        Integer [] arrayHarga = listHarga.toArray(new Integer[listHarga.size()]);
        harga=arrayHarga;
        String [] arraySatuan = listSatuan.toArray(new String[listSatuan.size()]);
        satuan=arraySatuan;
        String format= "| %1$-2s | %2$-15s | %3$-15s | %4$-10s |";
        System.out.println("\t\tUPDATE DATA BARANG ");
        System.out.println("+----+-----------------+-----------------+------------+");
        System.out.printf(format, "No", "Nama", "Harga", "Satuan");
        System.out.println();
        System.out.println("+----+-----------------+-----------------+------------+");

        for(i=0;i<harga.length;i++){ 
          System.out.format(format, i+1, nama[i], harga[i], satuan[i]);
          System.out.println();
        }
        System.out.println("+----+-----------------+-----------------+------------+");

        System.out.print("Kembali ke menu? (Y/N): ");
        konfirm=(input.readLine()).charAt(0);
        if((konfirm=='y') || (konfirm=='Y')){
            System.out.println("\n\n");
            menu();
        }
    }

    public static void cariBarang(String []nama, Integer []harga, String []satuan) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        char konfirm=' ';
        String cariNama;
       
        ArrayList<String> listNama = new ArrayList<String>(Arrays.asList(nama));
        int i, noIndex;
        do{
            System.out.print("Masukkan nama barang: ");
            cariNama = input.readLine();
            for(i=0;i<nama.length;i++){
                if(nama[i].equals(cariNama)){
                    noIndex=listNama.indexOf(cariNama);
                    System.out.println("=============================================");
                    System.out.println("Detail barang "+cariNama);
                    System.out.println("Harga\t: "+harga[noIndex]);
                    System.out.println("Satuan\t: "+satuan[noIndex]);
                }
            }
            
            System.out.print("Cari lagi? (Y/N): ");
            konfirm=(input.readLine()).charAt(0);
        } while((konfirm=='y') || (konfirm=='Y'));

        System.out.print("Kembali ke menu? (Y/N): ");
        konfirm=(input.readLine()).charAt(0);

        if((konfirm=='y') || (konfirm=='Y')){
            System.out.println("\n\n");
            menu();
        }
    }

    public static void maxBarang(String []nama, Integer []harga, String []satuan) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        char konfirm=' ';
        int max;
        int min;
        
        max=harga[0];
        int i;
        for(i=1;i<harga.length;i++){
            if(harga[i]>max){
                max=harga[i];
            }
        }
        min=harga[0];
        for(i=1;i<harga.length;i++){
            if(harga[i]<min){
                min=harga[i];
            }
        }
        ArrayList<Integer> listHarga = new ArrayList<Integer>(Arrays.asList(harga));
        int noIndexMin=listHarga.indexOf(min);
        int noIndexMax=listHarga.indexOf(max);
        System.out.println("Harga barang paling Mahal\t: "+max);
        System.out.println("Nama\t: "+nama[noIndexMax]);
        System.out.println("Satuan\t: "+satuan[noIndexMax]);
        System.out.println("=============================================");
        System.out.println("Harga barang paling Murah\t: "+min);   
        System.out.println("Nama\t: "+nama[noIndexMin]);
        System.out.println("Satuan\t: "+satuan[noIndexMin]);

        /* max=Collections.max(Arrays.asList(harga));
        min=Collections.min(Arrays.asList(harga));
        ArrayList<Integer> listHarga = new ArrayList<Integer>(Arrays.asList(harga));
        int noIndexMin=listHarga.indexOf(min);
        int noIndexMax=listHarga.indexOf(max);
        System.out.println("Harga barang paling Mahal\t: "+max);
        System.out.println("Nama\t: "+nama[noIndexMax]);
        System.out.println("Satuan\t: "+satuan[noIndexMax]);
        System.out.println("=============================================");
        System.out.println("Harga barang paling Murah\t: "+min);   
        System.out.println("Nama\t: "+nama[noIndexMin]);
        System.out.println("Satuan\t: "+satuan[noIndexMin]);   */

        System.out.print("Kembali ke menu? (Y/N): ");
        konfirm=(input.readLine()).charAt(0);

        if((konfirm=='y') || (konfirm=='Y')){
            System.out.println("\n\n");
            menu();
        }
    }

    public static void pembelianBarang(String []nama, Integer []harga, String []satuan) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        Integer []jumlah={ };
        String []notaNama={ };
        Integer []notaHarga={ };
        Integer []notaTotalHarga={ };
        char konfirm=' ';
        String tampilNama="";
        int i, noIndex, no, tempJumlah, totalHarga, totalBelanja=0, bayar;
        Integer tampilHarga=0;
        double diskon, jumlahBayar, kembalian;

        ArrayList<Integer> listJumlah = new ArrayList<Integer>(Arrays.asList(jumlah));
        ArrayList<String> listNama = new ArrayList<String>(Arrays.asList(notaNama));
        ArrayList<Integer> listHarga = new ArrayList<Integer>(Arrays.asList(notaHarga));
        ArrayList<Integer> listTotalHarga = new ArrayList<Integer>(Arrays.asList(notaTotalHarga));
        do{
            String format= "| %1$-2s | %2$-15s | %3$-15s |";

            System.out.println("\t\tDaftar Barang ");
            System.out.println("+----+-----------------+-----------------+");
            System.out.printf(format, "No", "Nama", "Harga");
            System.out.println();
            System.out.println("+----+-----------------+-----------------+");
    
            for(i=0;i<nama.length;i++){ 
              System.out.format(format, i+1, nama[i], harga[i]);
              System.out.println();
            }
            System.out.println("+----+-----------------+-----------------+");
        do{
            System.out.print("Masukkan no barang: ");
            no = Integer.parseInt(input.readLine());
            noIndex=no-1;
            if(noIndex<nama.length){
                tampilNama=nama[noIndex];
                listNama.add(tampilNama);
                tampilHarga=harga[noIndex];
                listHarga.add(tampilHarga);
            }else{
                System.out.println("Barang belum terdaftar!");
            }
            
            System.out.println("Barang\t\t: "+tampilNama);
            System.out.println("Harga\t\t: Rp "+tampilHarga);
            System.out.print("Jumlah\t\t: ");
            tempJumlah = Integer.parseInt(input.readLine());
            listJumlah.add(tempJumlah);

            totalHarga=tempJumlah * tampilHarga;
            listTotalHarga.add(totalHarga);
            totalBelanja+=totalHarga;
            System.out.println("Total Harga\t: Rp "+totalHarga);

            String [] arrayNama = listNama.toArray(new String[listNama.size()]);
            notaNama=arrayNama;
            Integer [] arrayHarga = listHarga.toArray(new Integer[listHarga.size()]);
            notaHarga=arrayHarga;
            Integer [] arrayJumlah = listJumlah.toArray(new Integer[listJumlah.size()]);
            jumlah=arrayJumlah;
            Integer [] arrayTotalHarga = listTotalHarga.toArray(new Integer[listTotalHarga.size()]);
            notaTotalHarga=arrayTotalHarga;
            System.out.println("-----------------------------------------");
            System.out.print("Mau nambah (Y/T)? ");
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
        System.out.println("\t\t\t   Toko Cuma-Cuma ");
        System.out.println("\t\t Jl. Gajah Terbang No. 69, Kuvukiland ");
        String formatNota= "| %1$-2s | %2$-15s | %3$-15s | %4$-10s | %5$-15s |";
        System.out.println("+----+-----------------+-----------------+------------+-----------------+");
        System.out.printf(formatNota, "No", "Nama", "Harga", "Qty", "Total");
        System.out.println();
        System.out.println("+----+-----------------+-----------------+------------+-----------------+");

        for(i=0;i<notaNama.length;i++){ 
          System.out.format(formatNota, i+1, notaNama[i], notaHarga[i], jumlah[i], notaTotalHarga[i]);
          System.out.println();
        }
        System.out.println("+----+-----------------+-----------------+------------+-----------------+");

        System.out.println("Jumlah belanja\t: Rp "+totalBelanja);
        System.out.println("Diskon\t\t: Rp "+diskon);
        System.out.println("Jumlah Bayar\t: Rp "+jumlahBayar);
        System.out.print("Bayar\t\t: Rp ");
        bayar = Integer.parseInt(input.readLine());
        kembalian=bayar-jumlahBayar;
        System.out.println("Kembalian\t: Rp "+kembalian);
        System.out.println("-----------------------------MATUR SUWUN--------------------------------");
        
        System.out.print("Belanja lagi? (Y/N): ");
        konfirm=(input.readLine()).charAt(0);
    }   while((konfirm=='y') || (konfirm=='Y'));
        System.out.print("Kembali ke menu? (Y/N): ");
        konfirm=(input.readLine()).charAt(0);

        if((konfirm=='y') || (konfirm=='Y')){
            System.out.println("\n\n");
            menu();
        }
    }
}

        /*

        +----------------------------------------------+
        | Nama	: Icha Bella Noviana        (M3117049) | 
        |         Irfan Dwi Prasetyo        (M3117052) |  
        |         Marzan Zulfikar Tunjung   (M3117055) |  
        |         Nadia Maulidha P P        (M3117069) |  
		| Kelas	: TI C 2K17                            |
	    +----------------------------------------------+
        
        */