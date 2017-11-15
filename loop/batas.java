import java.io.*;

public class batas{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int angka1, angka2; 

        System.out.print("Masukkan angka pertama: ");
        angka1 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan angka kedua: ");
        angka2 = Integer.parseInt(input.readLine());

        for(int i=angka1;i<=angka2;i++){
            System.out.print(i+" ");
        }
    }
}