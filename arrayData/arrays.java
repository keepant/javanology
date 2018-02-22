import java.util.*;

public class arrays{
    public static void main(String[] args){
        int num[]= {50, 20, 45, 82, 25, 63};
        int l = num.length;
        int i,j,t;
        System.out.print("Give number: ");
        for(i=0;i<l;i++){
            System.out.print(" " +num[i]);
        }
        System.out.print("\n\nAscending order number: ");
        Arrays.sort(num);
        for(i=0;i<l;i++){
            System.out.print(" "+num[i]);
        }
    }   
}