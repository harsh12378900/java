package recur;
import java.util.Scanner;
public class logrithmic_power {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("enetr the num");
        n1=s.nextInt();
        System.out.println("enter the power");
        n2=s.nextInt();
n3=log(n1,n2);
System.out.println(n3);
    }
    public static int log(int n1,int n2){
        int xn1,r1;
        if(n2==0){
            return(1);
        }
        else{
            xn1=log(n1,n2/2);
            r1=xn1*xn1;
        }
        if(xn1==1){
            r1=r1*n1;
        }
        return(r1);
    }
}
