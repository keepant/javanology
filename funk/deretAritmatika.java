import java.io.*;

public class deretAritmatika{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
        int a, b, n;
        
        System.out.print("Masukkan suku pertama: ");
        a = Integer.parseInt(input.readLine());
        System.out.print("Masukkan beda: ");
        b = Integer.parseInt(input.readLine());
        System.out.print("Masukkan jumlah suku n: ");
        n = Integer.parseInt(input.readLine());

        System.out.println("---Mencari jumlah suku ke n dengan fungsi return tanpa rekursi---");
        System.out.println("Jumlah bilangan suku ke-"+n+" adalah "+aritmatikaReturn(a, b, n));
        System.out.println("------------------------------------------------------------------");
        System.out.println("---Mencari jumlah suku ke n dengan fungsi return dengan rekursi---");
        System.out.println("Jumlah bilangan suku ke-"+n+" adalah "+aritmatikaRekursif(a, b, n));
    }

    public static int aritmatikaReturn(int a, int b, int n){
        int un, hasil=0;
        int i=1;

        while(i<=n){
            un=a+(i-1)*b;
            hasil+=un;
            i++;
        }
        return hasil;
    }

    public static int aritmatikaRekursif(int a, int b, int n){
        int un, hasil=0;

        if(n==0){
            hasil=n;
        } else if(n==1){
            hasil=n;
        } else{
            hasil=a+(n-1)*b+aritmatikaRekursif(a, b, n-1);            
        }
        return hasil;
    }
}