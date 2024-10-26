package recur;
import java.util.Scanner;
public class factorial {
    public static int fac(int v){
        if(v==0){
            return(1);
        }else{
            return(v*fac(v-1));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,c;
        a=s.nextInt();
c=fac(a);
System.out.println(c);

    }
}
