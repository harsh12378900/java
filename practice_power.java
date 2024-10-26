package recur;
import java.util.Scanner;
public class practice_power {
    public static int num(int x, int n)
    {if(n==0){
        return(1);
    }//if(x==0){
    //     return(0);
    // }
        int xpower=num(x,n-1);
        int xpow=x*xpower;
        return xpow;

    }
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=num(a,b);
        System.out.println("the power of these number"+c);

    }
}
