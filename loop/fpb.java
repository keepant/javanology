import java.io.*;

public class fpb{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int bil1, bil2, r;

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = Integer.parseInt(input.readLine());

        r = bil1 % bil2;
        do{
            bil1 = bil2;
            bil2 = r;
            r = bil1 % bil2;
        }while(r!=0);
        System.out.println("FPBnya adalah: "+bil2);
    }
}