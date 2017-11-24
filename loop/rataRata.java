import java.io.*;

public class rataRata{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i=1, n, s, hasil=0;
        double rata;
        
        System.out.print("Masukkan nilai n: ");
        n = Integer.parseInt(input.readLine());
        while(i<=n){
            System.out.print("Masukkan angka ke-"+i+": ");
            s = Integer.parseInt(input.readLine());
            hasil+=s;
            i++;
        }
        rata=(double)hasil/n;
        System.out.println("Rata-ratanya adalah "+rata);
    }
}