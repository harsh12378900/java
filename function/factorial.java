package java.function;
import java.util.Scanner;
public class factorial {
    public static void fact( long a){
        
        System.out.println("enter the number of a");
long f=1,i;

      for(i=1;i<=a;i++){
       f=f*i;
    }
    System.out.println("the factorial of perticular number :"+f);
    return;
}
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner s=new Scanner(System.in);
    long c=s.nextInt();
    fact(c);
}
}
