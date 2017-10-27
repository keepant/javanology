import java.io.*;

public class positif{
    public static void main(String[] args) throws Exception{
         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

         int nilai;
         String hasil="";

         System.out.print("Masukkan bilangan: ");
         nilai = Integer.parseInt(input.readLine());

         if(nilai % 2 == 1){
            hasil="Positif Ganjil";
         } else{
            hasil="Positif Genap";
         }

         if(nilai<0){
            hasil="Negatif";
        }
         System.out.println("Bilangan "+nilai+ " adalah bilangan "+hasil);
    }
}