import java.io.*;

public class nested{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int nilai;
        char predikat;
        String status;

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

        if ((nilai>=0)&&(nilai<=100)){
            status="VALID";
        } else {
            status="TIDAK VALID";
        }
        System.out.println("Nilai "+status);

        if ((nilai<0)||(nilai>100)){
            status="TIDAK VALID";
        } else {
            status="VALID";
        }
        System.out.println("Nilai "+status);
    }
}