import java.io.*;

public class karakter{
    public static void main(String[] args) throws Exception{
        BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
    
        char kar;
        do{
            System.out.print("Masukkan karakter: ");
            kar = (input.readLine()).charAt(0);
            System.out.println("Karakter anda: "+kar);
        } while((kar!='x') && (kar!='X'));
    }
}