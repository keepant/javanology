public class operasi {
    public static void main(String[] args) {
        int x, y, z, hasil;
        double hasilBagi;
        x = 2;
        y = 5;
        z = 7;

        hasil = x + y;
        System.out.println("add: "+hasil);
        hasil = x - z;
        System.out.println("subs: "+hasil);
        hasil = y * z;
        System.out.println("multi: "+hasil);
        hasil = z % x;
        System.out.println("mod: "+hasil);
        hasilBagi = (double) y / x;
        System.out.println("div "+hasilBagi);

        z=z+2;
        System.out.println("add 2= "+z);
        y=y*3;
        System.out.println("multi 3="+z);
    }
}