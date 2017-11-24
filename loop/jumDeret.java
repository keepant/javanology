import java.io.*;

public class jumDeret{
    public static void main(String[] args) throws Exception{
        BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
        int i=1, n, b, a, sn=0, ui;

        System.out.print("Masukkan nilai awal: ");
        a = Integer.parseInt(input.readLine());
        System.out.print("Masukkan beda: ");
        b = Integer.parseInt(input.readLine());
        System.out.print("Masukkan jumlah deret: ");
        n = Integer.parseInt(input.readLine());

        while(i<=n){
            ui=a+(i-1)*b;
            System.out.println("Deret ke-"+i+": "+ui);
            sn+=ui;
            i++;
        }
        System.out.println("Jumlah deret adalah "+sn);
    }
}