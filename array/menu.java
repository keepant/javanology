import java.io.*;

public class menu{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        char noMenu;

        System.out.println("--------MENU--------");
        System.out.println("1. Input barang \n2. Pencarian barang \n3. Harga max barang \n4. Pembelian barang");
        System.out.print("Masukkan no menu: ");
        noMenu = (input.readLine()).charAt(0);
        if(noMenu=='1'){
            System.out.println("Input barang");
        } else if(noMenu=='2'){
            System.out.println("Pencarain barang");
        } else if(noMenu=='3'){
            System.out.println("harga max");
        } else if(noMenu=='4'){
            System.out.println("pembelian barang");
        } else{
            System.out.println("Menu tidak tersedia!");
        }
    }
}