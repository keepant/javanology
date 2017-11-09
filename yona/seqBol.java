import java.io.*;

public class seqBol{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int sisi;
        System.out.print("Masukkan sisi: ");
        sisi = Integer.parseInt(input.readLine());

        for(int i=1;i<=sisi;i++){
            for(int j=1;j<=sisi;j++){
                if (i==1||i==sisi||j==1||j==sisi){
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