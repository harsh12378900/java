package java.function;
import java.util.Scanner;


public class addition {
    public static float add(float x ,float y){
    float g;
    g=x+y;
    return(g);
    }
    public static void main(String[] args) {
        System.out.println("enter the two number a and b");
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        float a,b,c;
        a=s.nextFloat();
        b=s.nextFloat();
        c=add(a,b);
        System.out.println(c);
    }
    
    
}
