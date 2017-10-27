import java.io.*;

public class maks{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int bil1, bil2, bil3;
        int max=0;

        System.out.print("Masukkan bilangan 1: ");
        bil1 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan bilangan 2: ");
        bil2 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan bilangan 3: ");
        bil3 = Integer.parseInt(input.readLine());

        if(bil1>bil2){
            max=bil1;
        } else {
            max=bil2;
        }
        if(bil3>max){
            max=bil3;
        }

        System.out.println("Bilangan Maksimal: "+max);
    }
}