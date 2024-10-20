package java.function;
import java.util.Scanner;

public class average_three_num {
    public static void avg( float a){
        
        System.out.println("enter the number of a");
float f=0,i;

      for(i=1;i<=a;i++){
       f=(f+i);
    }
    System.out.println("the factorial of perticular number :"+f/a);
    return;
}
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner s=new Scanner(System.in);
    float c=s.nextInt();
    avg(c);
}
}

