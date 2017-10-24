import java.io.*;

public class gaji{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int golongan;
        double totalGaji=0;

        System.out.print("Masukkan golongan: ");
        golongan = Integer.parseInt(input.readLine());
        
        if(golongan==1){
            totalGaji=1000000;
        } else if(golongan==2){
            totalGaji=2000000;
        } else if(golongan==3){
            totalGaji=3000000-0.02*3000000;
         }
        System.out.println("Total gaji: "+totalGaji);
    }
}