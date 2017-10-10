import java.io.*;

public class swaping{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int bil1, bil2;
        try{
            System.out.println("---INPUTAN HARUS BILANGAN BULAT---");
            System.out.print("Masukkan Bilangan A: ");
            bil1 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Bilangan B: ");
            bil2 = Integer.parseInt(input.readLine());

            bil1=bil1+bil2;
            bil2=bil1-bil2;
            bil1=bil1-bil2;

            System.out.println("-------Hasil setelah pertukaran nilai-------");
            System.out.println("Bilangan A: "+bil1);
            System.out.println("Bilangan B: "+bil2);
        } catch(NumberFormatException e){
            System.out.println("Inputan harus bilangan bulat!!");
        }
    }
}