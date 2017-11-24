import java.io.*;

public class kaliBil{
    public static void main(String[] args) throws Exception{
        BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
    
        int i, n, bil, kali;

        System.out.print("Masukkan nilai n: ");
        n = Integer.parseInt(input.readLine());
        kali=1;
        i=1;
        while(i<=n){
            System.out.print("Masukkan Bilangan: ");
            bil=Integer.parseInt(input.readLine());
            kali*=bil;
            i++;
        }
        System.out.println("Hasil perkaliannya adalah "+kali);
    }
}