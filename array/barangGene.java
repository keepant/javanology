import java.io.*;

public class barang {
	public static void main (String[] args ) throws java.lang.Exception {
		BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));	
	int item;
	int i=0;
	String []namabarang = new String[i];
	int[]hargabarang = new int[i];
	int[]jumlahbarang = new int[i];	
	int jumlahtotal=0;
	double diskon=0;
	double jumlahbayar=0;
	int bayar;
	double kembalian;
		System.out.print("jumlah item barang: ");
		item= Integer.parseInt(Input.readLine());
		
	for(i=0;i<item;i++)
		{
		System.out.print("nama barang ke-" +(i+1)+ " : ");
		namabarang[i]= Input.readLine();
		System.out.print("harga barang : ");
		hargabarang[i]= Integer.parseInt(Input.readLine());
		System.out.print("jumlah barang: ");
		jumlahbarang[i]= Integer.parseInt(Input.readLine());
		}
	System.out.println("--NOTA--");
	System.out.println("NO  NAMA BARANG  JUMLAH  HARGA  TOTAL");
	for(i=0;i<item;i++)
		{
		System.out.println((i+1)+ "  " +namabarang[i]+ "  " +jumlahbarang[i]+ "  " +hargabarang[i]+ "  " +(jumlahbarang[i]*hargabarang[i]));
		jumlahtotal=jumlahtotal+(jumlahbarang[i]*hargabarang[i]);
		}
	
	if(jumlahtotal>=500000){
		diskon=(double)0.15 * jumlahtotal;
		} else if(jumlahtotal>=250000){
			diskon=(double)0.1 * jumlahtotal;
			} else{
				diskon=(double)0.05 * jumlahtotal;
				}
				
	jumlahbayar=(double)jumlahtotal-diskon;
		System.out.println("Jumlah belanja: "+jumlahtotal);
		System.out.println("Diskon: Rp "+diskon);
		System.out.println("Jumlah Bayar: Rp "+jumlahbayar);
		System.out.print("Bayar: Rp ");
		bayar = Integer.parseInt(Input.readLine());
		kembalian =(double) bayar - jumlahbayar;
		System.out.println("Kembalian: Rp "+kembalian);

}
}