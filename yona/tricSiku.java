import java.io.*;

public class tricSiku{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int k = 1;
        int a;
        
        System.out.print("Masukkan nilai: ");
        a = Integer.parseInt(input.readLine());
        for(int i = 0; i < a; i++){
            for(int j = 0; j < k; j++){
                System.out.print(" *");
            }
            System.out.println("");   
            k = k + 1;
        }
    }
}