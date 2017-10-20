import java.io.*;

public class basic{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int nilai;

        System.out.print("Masukkan nilai: ");
        nilai = Integer.parseInt(input.readLine());
        if(nilai==0){
            System.out.println("Mahasiswa tidak mengikuti kuliah");
        }
        if(nilai>=60){
            System.out.println("Mahasiswa Lulus");
        }else{
            System.out.println("Mahasiswa Tidak Lulus");
        }

        String ket;
        if(nilai>=60){
            ket="LULUS";
        }else{
            ket="TIDAK LULUS";
        }
        System.out.println("Mahasiswa dinyatakan: "+ket);

     /*   if(nilai<60){
            ket="TIDAK LULUS";
        }else{
            ket="LULUS";
        }
        System.out.println("Mahasiswa dinyatakan: "+ket); */
    }
}