import java.io.*;

public class methodEx{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int umur=19;
        int a=2, b=3;
        garis();
        cetakNama("Mario", umur);
        jmlAngka(a, b);
        System.out.println(a+" + "+b+" = "+jmlAngkaDua(a, b));
    }

    public static void garis(){
        System.out.println("------------------------------------------------------");
    }

    public static void cetakNama(String nama, int usia){
        System.out.println("your name: "+nama);
        System.out.println("your age: "+usia);
        garis();
    }

    public static void jmlAngka(int x, int y){      
        int z=x+y;
        System.out.println(x+" + "+y+" = "+z);
        garis();
    }

    public static int jmlAngkaDua(int x, int y){      
        int z=x+y;
        return z;
    }
}
