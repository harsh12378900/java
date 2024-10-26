package recur;
import java.util.Scanner;
public class fabbonacci {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
       int a,c;
       a=s.nextInt();
       c=feb(a);
System.out.println(c);

    
    }
    public static int feb(int x){
        if(x==0){
            return(0);
        }
        if(x==1){
            return(1);
        }
        return(( feb(x-1)+feb(x-2)));
    }
}
