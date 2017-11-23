import java.io.*;

public class karakter{
    public static void main(String[] args) throws Exception{
        BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
    
        char kar;
        int nilai=0;

        do{
            System.out.print("Masukkan karakter: ");
            kar = (input.readLine()).charAt(0);
            System.out.println(kar);
            nilai++;
            if((kar=='x') || (kar=='X')){
                nilai-=nilai;
            }
        } while(nilai>=1);
    }
}