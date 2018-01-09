import java.io.*;

public class deretGeometri{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
        int a, r, n;
        
        System.out.print("Masukkan suku pertama: ");
        a = Integer.parseInt(input.readLine());
        System.out.print("Masukkan rasio: ");
        r = Integer.parseInt(input.readLine());
        System.out.print("Masukkan jumlah suku n: ");
        n = Integer.parseInt(input.readLine());

        System.out.println("---Mencari jumlah suku ke n dengan fungsi return tanpa rekursi---");
        System.out.println("Jumlah bilangan suku ke-"+n+" adalah "+geometriReturn(a, r, n));
        System.out.println("------------------------------------------------------------------");
        System.out.println("---Mencari jumlah suku ke n dengan fungsi return dengan rekursi---");
        System.out.println("Jumlah bilangan suku ke-"+n+" adalah "+geometriRekursif(a, r, n));
    }

    public static int geometriReturn(int a,  int r, int n){
        int hasil=0, un;
        int i=1;
        while(i<=n){
            un=a*(int)(Math.pow(r, (i-1)));
            hasil+=un;
            i++;
        }

        return hasil;
    }

    public static int geometriRekursif(int a, int r, int n){
        int un, hasil=0;

        if(n==0){
            hasil=n;
        } else if(n==1){
            hasil=a;
        } else{
            hasil=a*(int)(Math.pow(r, n-1))+geometriRekursif(a, r, n-1);            
        }
        return hasil;
    } 
}