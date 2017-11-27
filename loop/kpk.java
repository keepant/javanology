import java.io.*;

public class kpk{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int bil1, bil2;
        System.out.print("Masukkan bilangan pertama: ");
        bil1 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = Integer.parseInt(input.readLine());

        int hasil=0;
        for(int i=1;i<=bil2;i++){
            hasil = (hasil + bil1);
            if(hasil % bil2 ==0){
                System.out.println("KPK dari "+bil1+" dan "+bil2+" adalah "+hasil);
                break;
            }
        }
    }
}