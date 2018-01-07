import java.io.*;
public class barangArnes{
public static void main (String[] args ) throws java.lang.Exception {
BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));

	int i=0,kembalian,uang,total=0,n=6;
	String 	[] nama = new String [n];
	int 	[] harga = new int [n];	
	int 	[] list = new int [n];
	int 	[] jumlah = new int [n];
	
	nama[1]="Tepung        ";harga[1]=8400 ;
	nama[2]="Minyak        ";harga[2]=12000;
	nama[3]="Daging Ayam   ";harga[3]=33000;
	nama[4]="Ikan Bandeng  ";harga[4]=32000;
	nama[5]="Penyedap Rasa ";harga[5]=1000 ;
	
	
	System.out.println("	SELAMAT DATANG DI TOKO KELOMPOK 5	");
	for(i=1;i<nama.length;i++)
	{
		System.out.println("Daftar Barang yang Ada ke "+(i)+": "+nama[i]+" | Harga : "+harga[i]);	
	}
	System.out.println("---------------------------------------------------");
	System.out.println("	Masukkan Jumlah Barang Yang Ingin Dibeli	");
	System.out.println("	(Masukkan 0 Jika Tidak Ingin Membeli)	");
	for(i=1;i<jumlah.length;i++)
	{
		System.out.print(nama[i]+" :"); 
        jumlah[i]=Integer.parseInt(Input.readLine());
	}
	
	for(i=0;i<jumlah.length;i++)
	{
	System.out.println((i+1)+". Barang : "+nama[i]+" 	Jumlah : "+jumlah[i]+" 	Total Harga: "+(harga[i]*jumlah[i]));
		total=total+(harga[i]*jumlah[i]);
	}
		System.out.println("-------------------------------------------------------------------- +");
		System.out.println("		         			Total Belanja Anda: "+total);
		System.out.println("		         			");
		System.out.print("Silahkan Masukkan Uang Anda : Rp");
			uang=Integer.parseInt(Input.readLine());
			kembalian=uang-total;
		if(uang<total)
		{
			System.out.print("Maaf Uang Anda Kurang");
		} else {System.out.println("Kembalian anda: Rp  "+kembalian);}
	
	
	
	
}
}