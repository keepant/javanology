import java.io.*;

public class fibonansi{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
        int n;
        
        System.out.print("Masukkan jumlah deret: ");
        n = Integer.parseInt(input.readLine());

        System.out.println("---Menentukan deret ke n fibonansi dengan fungsi return tanpa rekursi---");
        System.out.println("Deret ke-"+n+" adalah "+fibonansiReturn(n));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("---Menentukan deret ke n fibonansi dengan fungsi return dengan rekursi---");
        System.out.println("Deret ke-"+n+" adalah "+fibonansiRekursif(n));
    }

    public static int fibonansiReturn(int n){
       int a=0, b=1;

       for(int i=1;i<=n;i++){
           a=a+b;
           b=a-b;
       }
       
       System.out.print(a);

       return a;
    }

    public static int fibonansiRekursif(int n){
        int hasil;
        if(n==0){
            hasil=n;
        } else if(n==1){
            hasil=n;
        } else{
            hasil=fibonansiRekursif(n-1)+fibonansiRekursif(n-2);
        }
        return hasil;
    }
}
