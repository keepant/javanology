import java.io.*;

public class deretGeo{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int a, rasio, un, n, hasil;

        System.out.print("Masukkan suku pertama: ");
        a = Integer.parseInt(input.readLine());
        System.out.print("Masukkan rasio: ");
        rasio = Integer.parseInt(input.readLine());
        System.out.print("Masukkan jumlah suku n: ");
        n = Integer.parseInt(input.readLine());

        hasil=0;
        int i=1;
        while(i<=n){
            un=a*(int)(Math.pow(rasio, (i-1)));
            hasil+=un;
            System.out.println("Suku ke-"+i+" = "+un);
            i++;
        }
        System.out.print("Jumlah bilangan suku ke-"+n+" adalah "+hasil);
    }
}