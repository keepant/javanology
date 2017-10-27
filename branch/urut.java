import java.io.*;

public class urut {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int data1, data2, temp;

        System.out.print("Masukkan bilangan 1: ");
        data1 = Integer.parseInt(input.readLine());
        System.out.print("Masukkan bilangan 2: ");
        data2 = Integer.parseInt(input.readLine());

        if(data1>data2){
            temp=data1;
            data1=data2;
            data2=temp; 
        }

        System.out.println("Urutan: "+data1+", "+data2);
    }
}