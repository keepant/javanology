class operasi{
    public static void main(String[] args) {
        int x,y,z; 
        boolean status; 
        x=2; 
        y=5;
        z=7;

        status = (x < y)&(x<z);
        System.out.println("status : "+status);
        status = (x <y)&&(x<z);
        System.out.println("status : "+status);
        status = (x <y)|(x>z);
        System.out.println("status : "+status); 
        status = (x<y)||(x>z);
        System.out.println("status : "+status); 
        status = !(x<y);
        System.out.println("status : "+status);
         
    }
}