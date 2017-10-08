import java.io.*;


public class rataRata{
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int bil1, bil2, bil3;
        double hasil;

        try{
            System.out.println("-----HARAP MASUKKAN DENGAN BILANGAN BULAT-----");
            System.out.print("Masukkan bilangan pertama: ");
            bil1 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan bilangan kedua: ");
            bil2 = Integer.parseInt(input.readLine());
            System.out.print("Masukkan bilangan ketiga: ");
            bil3 = Integer.parseInt(input.readLine());
            
            hasil=(double)(bil1+bil2+bil3)/3;

            System.out.println("Rata-rata dari ketiga bilangan tersebut: "+hasil);
        }catch(NumberFormatException e){
            System.out.println("Inputan harus bilangan bulat!");
        }
        
    }
}