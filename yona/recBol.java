import java.io.*;

public class recBol{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

        int panjang, lebar;

        System.out.print("Masukkan Panjang: ");
        panjang = Integer.parseInt(input.readLine());
        System.out.print("Masukkan Lebar: ");
        lebar = Integer.parseInt(input.readLine());
        
        for(int i=1; i<=lebar; i++) {
            for(int j=1; j<=panjang; j++) {
                if (i==1||i==lebar||j==1||j==panjang){
                    System.out.print("*"); 
                }else{
                    System.out.print(" ");
                }
            }
                System.out.println("");
        }
            System.out.println("");
    }
}