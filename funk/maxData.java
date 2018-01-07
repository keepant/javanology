import java.io.*;
public class maxData{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  
        int bil1, bil2, bil3;
        int max=0;

        System.out.print("Masukkan bilangan 1: ");
        bil1 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan bilangan 2: ");
        bil2 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan bilangan 3: ");
        bil3 = Integer.parseInt(input.readLine());
        System.out.println("Data maksimal: "+maksimal(bil1, bil2, bil3));
    }

    public static int maksimal(int a, int b, int c){
        int max;
        if(a>b){
            max=a;
        } else {
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
}