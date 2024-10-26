package recur;
import java.util.Scanner;
public class revese {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    System.out.println("enter the string");
    String n;
    n=s.nextLine();
    int c;
 revrse(n,n.length()-1);
}
public static void revrse(String a,int x){
if(x==0){
    System.out.println(a.charAt(x));
    return;

}
System.out.println(a.charAt(x));
revrse(a,x-1);

    }
}
