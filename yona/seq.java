import java.io.*;

public class seq{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

        int sisi;

        System.out.print("Masukkan Sisi: ");
        sisi = Integer.parseInt(input.readLine());
        for(int i=0;i<sisi;i++){
            for(int j=0;j<sisi;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}