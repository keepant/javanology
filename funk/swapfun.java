import java.io.*;
public class swapfun{
    public static void main(String[] args) {
        int[] x =new int [6];
        x[1]=1;
        x[2]=2;
        x[3]=3;
        x[4]=4;
        x[5]=5;

        tukar2Data(x,1,2);
        tukar2Data(x,3,5);
        for(int i=1;i<=5;i++){
            System.out.println("Nilai x["+i+"]:"+x[i]);
        }
    }
    
    public static void tukar2Data(int [] y, int a, int b){
        int temp;
        temp=y[a];
        y[a]=y[b];
        y[b]=temp;
    }
}