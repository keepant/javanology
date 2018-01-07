import java.io.*;
public class segitiga{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
        int sisi1, sisi2, sisi3;
        

        System.out.print("Masukkan sisi 1: ");
        sisi1 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan sisi 2: ");
        sisi2 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan sisi 3: ");
        sisi3 = Integer.parseInt(input.readLine());
        System.out.println("Segitiga: "+tentuSegitiga(sisi1, sisi2, sisi3));
    }

    public static String tentuSegitiga(int a, int b, int c){
        String hasil;
        if((a==b) && (b==c)){
            hasil="Sama Sisi";
        } else if((a==b) || (b==c) || (a==c)){
            hasil="Sama Kaki";
        } else{
            hasil="Sembarang";
        }

        return hasil;
    }
}