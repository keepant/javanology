import java.io.*;
import java.util.Scanner;

public class deret{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       /*  int nilai;
        int hasil=0;
        System.out.print("Masukkan nilai: ");
        nilai = Integer.parseInt(input.readLine());
        for (int i=1; i<=nilai; i++){
            hasil += i;
        }
            System.out.print("Jumlah bilangan asli dari "+nilai+" pertama adalah "+hasil); */
        
        int i, n, Sn;
        Sn=0;

        System.out.print("Masukkan nilai n: ");
        n=Integer.parseInt(input.readLine());
        i=1;
        while(i<=n){
            Sn = Sn+i;
        i++;}
        System.out.println("Jadi Jumlah dari Deret N: "+Sn);
    }
}