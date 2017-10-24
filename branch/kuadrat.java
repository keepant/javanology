import java.io.*;

public class kuadrat{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double a, b, c, D;
        double x1=0;
        double x2=0;
        String akar="";
        String definit;

        System.out.print("Masukkan nilai a: ");
        a = Integer.parseInt(input.readLine());
        System.out.print("Masukkan nilai b: ");
        b = Integer.parseInt(input.readLine());
        System.out.print("Masukkan nilai c: ");
        c = Integer.parseInt(input.readLine());

        D = Math.pow(b,2) - 4*a*c;
        
        if(D==0){
            akar="SAMA";
            x1 = (-b+Math.sqrt(D))/(2*a);
            x2 = (-b-Math.sqrt(D))/(2*a);   
            System.out.println("x1:  "+x1);
            System.out.println("x2:  "+x2);   
        }  else if (D>0){
            akar="NYATA";
            x1 = (-b+Math.sqrt(D))/(2*a);
            x2 = (-b-Math.sqrt(D))/(2*a);  
            System.out.println("x1:  "+x1);
            System.out.println("x2:  "+x2); 
        } else {
            akar="KHAYAL";
            if (a>0){
                definit="POSITIF"; 
            } else {
                definit="NEGATIF"    ;
            }
            System.out.println("Definit: "+definit);
        }
        System.out.println("Sifat akarnya: "+akar);
    }
}