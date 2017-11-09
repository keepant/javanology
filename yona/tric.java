import java.io.*;

public class tric{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int a;
        System.out.print("Masukkan nilai: ");
        a  = Integer.parseInt(input.readLine());

        for (int i = a; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            } for (int j = a; j > i; j--){
                if (j==a||i==1){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }System.out.println(" *");
        }
    }
}