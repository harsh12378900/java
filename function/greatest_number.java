package java.function;
import java.util.Scanner;
public class greatest_number {
    public static int greatest( int a,int b){
        int h=(a>b?a:b);
        return(h);
    
}
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int c,d,x;
     c=s.nextInt();
     d=s.nextInt();

   x= greatest(c,d);
   System.out.println("the maximum number is :"+x);
}
}



