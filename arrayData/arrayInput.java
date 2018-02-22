import java.util.Scanner;
public class arrayInput{
    public static void main(String args[]){
        int[] nilaiUjian = new int [5];
        int i;
        Scanner masukan = new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.print("Nilai ujian ke-" +i+": ");
            nilaiUjian[i]=masukan.nextInt();
        }
        System.out.println("output: ");
        for(i=0;i<5;i++){
            System.out.print("Nilai ujian ke-" +i+": "+nilaiUjian[i]);
        }
    }
}