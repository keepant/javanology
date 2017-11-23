import java.io.*;
import java.util.Scanner;

public class deret{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int nilai;
        int hasil=0;
        System.out.print("Masukkan nilai: ");
        nilai = Integer.parseInt(input.readLine());
        for (int i=1; i<=nilai; i++){
            hasil += i;
        }
            System.out.print("Jumlah bilangan asli dari "+nilai+" pertama adalah "+hasil);
    }
}