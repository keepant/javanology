import java.io.*;

public class nested{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int nilai;
        char predikat;

        System.out.print("Masukkan Nilai: ");
        nilai = Integer.parseInt(input.readLine());

        if(nilai<60){
            predikat='C';
        } else if(nilai<80){
            predikat='B';
        } else {
            predikat='A';
        }
        System.out.println("Predikat Nilai: "+predikat);
    }
}