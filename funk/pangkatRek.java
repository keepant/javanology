import java.io.*;

public class pangkatRek{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int angka=0, pangkat=0;

        System.out.println("---Menghitung x pangkat y menggunakan fungsi return tanpa rekursi---");
        pangkatReturn(angka, pangkat);
    }

    public static int pangkatReturn(int x, int y) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int hasil, i;
        System.out.print("Masukkan angka: ");
        x = Integer.parseInt(input.readLine());
        System.out.print("Masukkan pangkat: ");
        y = Integer.parseInt(input.readLine());

        hasil=x;
        for(i=1;i<y;i++){
            hasil*=x;
        }

        System.out.println("Hasil dari "+x+"^"+y+" adalah "+hasil);

        return hasil;
    }
}