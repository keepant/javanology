public class arLoop{
    public static void main(String args[]){
        int[] myArray = {1, 23, 17, 4, -5, 100};
        int i;
        System.out.println("Menamppilkan data array dengan looping dari depan: ");
        for(i=0;i<6;i++){
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
        System.out.println("Menamppilkan data array dengan looping dari belakang: ");
        for(i=5;i>=0;i--){
            System.out.print(myArray[i]+" ");
        }
    }
}