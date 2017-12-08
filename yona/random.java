import java.util.*;
import java.io.*;

class random{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
   
        int batas;
        System.out.print("Masukkan batas: ");
        batas = Integer.parseInt(input.readLine());
   
        int c;
        Random t = new Random();

        for (c=1;c<=5;c++) {
            System.out.println(t.nextInt(batas));
        }

        
    }
}