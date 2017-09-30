public class var{
    public static void main(String[] args) {
        String nama;
        nama = "keepant";
        int umur, tahunLahir;
        umur = 18;
        tahunLahir = 1999;
        double ipk = 3.7;
        char kelas = 'C';
        boolean status = true;
        System.out.println("Nama saya "+nama);
        System.out.println("umur saya "+umur+" tahun");
        System.out.println("saya lahir tahun "+tahunLahir);
        System.out.println("IPK saya "+ipk);
        System.out.println("saya dari kelas "+kelas);
        if (status==true){
            System.out.println("Status mahasiswa aktif");
        } else {
            System.out.println("Status mahasiswa tidak aktif");
        }
    }
}