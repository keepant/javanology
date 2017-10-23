import java.io.*;

public class konversi{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int nilai;
        String status="";

        System.out.print("Masukkan nilai: ");
        nilai = Integer.parseInt(input.readLine());

        if((nilai>=0)&&(nilai<=100)){
            if (nilai>=80){
                status="SANGAT BAIK";
            } else if (nilai>=70){
                status="BAIK";
            } else if (nilai>=60){
                status="CUKUP";
            } else if(nilai<60){
                status="GAGAL";
            }
        } else{
            status="-";
        }
        System.out.println("Predikat: "+status);
    }
}