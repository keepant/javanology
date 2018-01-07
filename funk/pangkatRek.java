import java.io.*;

public class pangkatRek{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int angka, pangkat, hasil;

        System.out.print("Masukkan angka: ");
        angka = Integer.parseInt(input.readLine());
        System.out.print("Masukkan pangkat: ");
        pangkat = Integer.parseInt(input.readLine());

        System.out.println("---Menghitung x pangkat y menggunakan fungsi return tanpa rekursi---");
        pangkatReturn(angka, pangkat);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---Menghitung x pangkat y menggunakan fungsi return dengan rekursi---");
        System.out.println("Hasil dari "+angka+"^"+pangkat+" adalah "+pangkatRekursif(angka, pangkat));

    }

    public static int pangkatReturn(int x, int y){
        int hasil, i;

        hasil=x;
        for(i=1;i<y;i++){
            hasil*=x;
        }

        System.out.println("Hasil dari "+x+"^"+y+" adalah "+hasil);

        return hasil;
    }

    public static int pangkatRekursif(int x, int y){
        int hasil=0;

        if(y==1){
            hasil = x;
        } else {
            hasil = x * pangkatRekursif(x, y-1);
        }
        return hasil;

    }
}