package java.function;
import java.util.Scanner;
public class some_od_number {
    public static void sum_of_number( int a){
        
        System.out.println("enter the number of a");
int f=0,i;
for(i=1;i<=a;i++)
{
    if(i%2!=0){
       f=f+i;
    }
}
    
    System.out.println("the sum of odd number :"+f);
    return;
}
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner s=new Scanner(System.in);
    int c=s.nextInt();
    sum_of_number(c);
}
}


