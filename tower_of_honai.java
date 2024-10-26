package recur;
import java.util.Scanner;
public class tower_of_honai {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n,tower1,tower2,tower3;
    n=s.nextInt();
    tower1=s.nextInt();
    tower2=s.nextInt();
    tower3=s.nextInt();
    hinoi(n,tower1,tower2,tower3);
    }
   public static void hinoi(int n,int to1,int to2,int to3){
if(n==0){
    return;
}
hinoi(n-1,to1,to3,to2);
System.out.println(n +"["+to1 +"->"+ to2 +"]");
hinoi(n-1,to3,to2,to1);
   }
}
