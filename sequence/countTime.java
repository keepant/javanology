import java.io.*;

public class countTime{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int jamAwal, menitAwal, detikAwal, jamAkhir, menitAkhir, detikAkhir, hasilJam, hasilMenit, hasilDetik, waktuAwal, waktuAkhir, hasilWaktu, sisa;

        System.out.println("--HARAP MASUKKAN DENGAN BILANGAN BULAT--");
        System.out.print("Masukkan jam awal: ");
        jamAwal = Integer.parseInt(input.readLine());
        System.out.print("Masukkan menit awal: ");
        menitAwal = Integer.parseInt(input.readLine());
        System.out.print("Masukkan detik awal: ");
        detikAwal = Integer.parseInt(input.readLine());
        System.out.print("Masukkan jam akhir: ");
        jamAkhir = Integer.parseInt(input.readLine());
        System.out.print("Masukkan menit akhir: ");
        menitAkhir = Integer.parseInt(input.readLine());
        System.out.print("Masukkan detik akhir: ");
        detikAkhir = Integer.parseInt(input.readLine());

        waktuAwal = (3600*jamAwal)+(60*menitAwal)+detikAwal;
        waktuAkhir = (3600*jamAkhir)+(60*menitAkhir)+detikAkhir;
        hasilWaktu = waktuAkhir - waktuAwal;
        hasilJam = hasilWaktu / 3600;
        sisa = hasilWaktu % 3600;
        hasilMenit=sisa / 60;
        hasilDetik=sisa % 60;

        System.out.println("------HASIL PERHITUNGAN------");
        System.out.println("Waktu Awal Ujian: "+jamAwal+" Jam "+menitAwal+" Menit "+detikAwal+" Detik");
        System.out.println("Waktu Akhir Ujian: "+jamAkhir+" Jam "+menitAkhir+" Menit "+detikAkhir+" Detik");
        System.out.println("Durasi Ujian: "+hasilJam+" Jam "+hasilMenit+" Menit "+hasilDetik+" Detik");
    }
}