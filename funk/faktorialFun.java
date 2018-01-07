import java.io.*;
public class faktorialFun{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
        int n;
        
        System.out.print("Masukkan nilai n: ");
        n = Integer.parseInt(input.readLine());

        System.out.println("Faktorial dari "+n+" adalah "+hitungFaktroial(n));
        System.out.println("Faktorial dari "+n+" adalah "+fakRekursif(n));

    }

    public static int hitungFaktroial(int x){
        int fak=1;
        for(int i=1;i<=x;i++){
            fak*=i;
        }
        return fak;
    }

    public static int fakRekursif(int x){
        int fak;
        if (x!=1){
            fak=x*fakRekursif(x-1);
        } else{
            fak=1;
        }
        return fak;
    }
}