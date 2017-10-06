import java.io.*;

public class hitungOperator {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int x, y, add, subs, multi, mod;
        double div; 

        System.out.print("Masukkan nilai Pertama :");
        x = Integer.parseInt(input.readLine());
        System.out.print("Masukkan nilai Kedua :");
        y = Integer.parseInt(input.readLine());


        System.out.println("------------------------------HASIL----------------------------------");
        add=x+y;
        System.out.println(x+" + "+y+" = "+add);
        subs=x-y;
        System.out.println(x+" - "+y+" = "+subs);
        multi=x*y;
        System.out.println(x+" * "+y+" = "+multi);
        div=(double)x/y;
        System.out.println(x+" / "+y+" = "+div);
        mod=x%y;
        System.out.println(x+" % "+y+" = "+mod);

        System.out.println("Nilai x adalah : "+x);        
        System.out.println("Nilai x adalah : "+(x++));
        System.out.println("Nilai x adalah : "+(++x));
        x++;
        System.out.println("Nilai x adalah : "+x);
        ++x;
        System.out.println("Nilai x adalah : "+x); 
        System.out.println("Nilai x adalah : "+(x+=3)); 
        System.out.println("Nilai x adalah : "+(x-=1)); 
        System.out.println("Nilai x adalah : "+(x*=2));
        System.out.println("Nilai x adalah : "+(x%=3));  
    }
}