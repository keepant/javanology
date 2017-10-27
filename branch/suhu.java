import java.io.*;

public class suhu{
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double hasil, celcius;
        String konversi;
        int no;

        
        System.out.println("Daftar Konversi: \n1. Farenheit \n2. Reamur \n3. Kelvin");
        
        System.out.println("-------------------------------------------------------");
        System.out.print("Masukkan suhu celcius: ");
        celcius = Double.parseDouble(input.readLine());
        System.out.print("Konversi ke no: ");
        no = Integer.parseInt(input.readLine());

        if(no==1){
            hasil=1.8*celcius+32;
            konversi="Farenheit";
        } else if(no==2){
            hasil=0.8*celcius;
            konversi="Reamur";
        } else{
            hasil=celcius+273;
            konversi="Kelvin"; 
        }

        System.out.println("Hasil konversi: "+hasil+ " "+konversi);
    }
}