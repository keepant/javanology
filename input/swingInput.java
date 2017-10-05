import javax.swing.JOptionPane;

class swingInput{
    public static void main(String[] args) {
        String nama, x;
        int umur;
        double tinggi;
        char jenkel;
        boolean status;

        nama = JOptionPane.showInputDialog("Masukkan nama anda: ");
        x=JOptionPane.showInputDialog("Masukkan umur anda: ");
        umur = Integer.parseInt(x);
        x=JOptionPane.showInputDialog("Masukkan tinggi badan anda: ");
        tinggi = Double.parseDouble(x);
        x=JOptionPane.showInputDialog("Masukkan jenis kelamin anda: ");
        jenkel = x.charAt(0);
        x=JOptionPane.showInputDialog("status: ");
        status = Boolean.parseBoolean(x);
        System.out.println("-------------------------------------------OUTPUT-------------------------------------------------------");
        System.out.println("Nama: "+nama+"\nUmur: "+umur+"\nTinggi badan: "+tinggi+"\nJenis Kelmin: "+jenkel+"\nstatus: "+status);
    }
}