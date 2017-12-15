import java.io.*;

public class duaDimensi{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int max=4;
        int i, j;
        int [][]A=new int [max] [max];
        int [][]B=new int [max] [max];
        int [][]C=new int [max] [max];
        int [][]D=new int [max] [max];
        
        System.out.println("Masukkan Matrix A: ");
        for(i=1;i<max;i++){
            for(j=1;j<max;j++){
                System.out.print("A["+i+"]["+j+"]: ");
                A[i][j]=Integer.parseInt(input.readLine());
            }
        }

        System.out.println("\nMasukkan Matrix B: ");
        for(i=1;i<max;i++){
            for(j=1;j<max;j++){
                System.out.print("B["+i+"]["+j+"]: ");
                B[i][j]=Integer.parseInt(input.readLine());
            }
        }

        System.out.println("\nMatrix A: ");
        for(i=1;i<max;i++){
            System.out.print("|  ");
            for(j=1;j<max;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.print(" |");            
            System.out.println();
        }

        System.out.println("\nMatrix B: ");
        for(i=1;i<max;i++){
            System.out.print("|  ");
            for(j=1;j<max;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.print(" |");            
            System.out.println();
        }

        for(i=1;i<max;i++){
            for(j=1;j<max;j++){
               C[i][j]=A[i][j]+B[i][j];
            }
        }
        
        System.out.println("\nMatrix C (A+B): ");
        for(i=1;i<max;i++){
            System.out.print("|  ");
            for(j=1;j<max;j++){
               System.out.print(C[i][j]+" ");
            }
            System.out.print(" |");            
            System.out.println();
        }

       /*  for(i=1;i<max;i++){
            for(j=1;j<max;j++){
                D[i][j]=A[i][1]*B[1][j]+A[i][2]*B[2][j];
            }
        } */

        for(i=1;i<max;i++){
            for(j=1;j<max;j++){
                for(int k=1;k<max;k++){
                    D[i][j]+=A[i][k]*B[k][j];                    
                }
            }
        }

        
        System.out.println("\nMatrix D (A*B): ");
        for(i=1;i<max;i++){
            System.out.print("|  ");
            for(j=1;j<max;j++){
               System.out.print(D[i][j]+" ");
            }
            System.out.print(" |");            
            System.out.println();
        }

    }
}