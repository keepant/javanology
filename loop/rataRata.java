import java.io.*;

public class rataRata{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int nilai;
        int hasil=0;
        int rata=0;
        System.out.print("Masukkan nilai: ");
        nilai = Integer.parseInt(input.readLine());
        for (int i=1; i<=nilai; i++){
            hasil += i;
        }    
        rata=hasil/nilai;
        System.out.println("Jumlah bilangan dari "+nilai+" pertama adalah "+hasil);
        System.out.println("Rata-Rata: "+rata);
    }
}