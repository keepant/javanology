import java.io.*;

public class faktorial{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n, fak=1;
        System.out.print("Masukkan nilai n: ");
        n = Integer.parseInt(input.readLine());

        for(int i=1;i<=n;i++){
            fak*=i;
        }
        System.out.println("Faktorial dari "+n+" adalah "+fak);
    }
}