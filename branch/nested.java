import java.io.*;

public class nested{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int nilai;
        char predikat;

        System.out.print("Masukkan Nilai: ");
        nilai = Integer.parseInt(input.readLine());

        if(nilai<50){
            predikat='E';
        } else if(nilai<60){
            predikat='D';
        } else if(nilai<70){
            predikat='C';
        } else if(nilai<80){
            predikat='B';
        } else{
            predikat='A';
        }
        System.out.println("Predikat Nilai: "+predikat);
    }
}