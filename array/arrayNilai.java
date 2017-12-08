import java.io.*;

public class arrayNilai{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama[] = {"Ani","Budi","Ciki","Dodo"};
        int[] nilaiAlgo = new int[4];
        int[] nilaiMat = new int[4];
        double[] ipk = new double[4];
        /* nilaiAlgo[0]=90;
        nilaiAlgo[1]=70;
        nilaiAlgo[2]=70;
        nilaiAlgo[3]=80; */
        int i;
        for(i=0;i<nilaiAlgo.length;i++){
            System.out.print("Masukkan nilai Algo: "+nama[i]+": ");
            nilaiAlgo[i] = Integer.parseInt(input.readLine()); 
        }

        double jmlAlgo=0, rataAlgo;
        for(i=0;i<nilaiAlgo.length;i++){
            jmlAlgo+=nilaiAlgo[i];
        }
        rataAlgo=jmlAlgo/4;

        for(i=0;i<nilaiMat.length;i++){
            System.out.print("Masukkan nilai Mat: "+nama[i]+": ");
            nilaiMat[i] = Integer.parseInt(input.readLine()); 
        }

        double jmlMat=0, rataMat;
        for(i=0;i<nilaiMat.length;i++){
            jmlMat+=nilaiMat[i];
        }
        rataMat=jmlMat/4;

        for(i=0;i<ipk.length;i++){
            ipk[i]=(double)(nilaiAlgo[i]+nilaiMat[i])/2;
        }

        double jmlIPK=0, rataIPK;
        for(i=0;i<ipk.length;i++){
            jmlIPK+=ipk[i];
        }
        rataIPK=jmlIPK/4;

        for(i=0;i<nama.length;i++){
            System.out.println("Nama siswa ke-"+(i+1)+": "+nama[i]);
        }

        for(i=0;i<nilaiAlgo.length;i++){
            System.out.println("Nama Algo siswa "+nama[i]+": "+nilaiAlgo[i]);
        }

        for(i=0;i<nilaiMat.length;i++){
            System.out.println("Nama Mat siswa "+nama[i]+": "+nilaiMat[i]);
        }

        for(i=0;i<ipk.length;i++){
            System.out.println("IPK siswa "+nama[i]+": "+ipk[i]);
        }

        System.out.println("Rata-rata Nilai Algo: "+rataAlgo);
        System.out.println("Rata-rata Nilai Mat: "+rataMat);  
        System.out.println("Rata-rata Nilai IPK: "+rataIPK);   
        
        
    }
}