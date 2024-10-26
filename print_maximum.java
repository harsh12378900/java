package recur;
import java.util.Scanner;
public class print_maximum {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter the element");
    n=s.nextInt();
    System.out.println("enter the element");
    int array[]=new int[n];
    for(int i=0;i<array.length;i++){
        System.out.println("enter the element of index :"+i);
array[i]=s.nextInt();
    }
 int  c= max(array,array.length-1);
   System.out.println(c);
      }
      public static int max(int x[],int ind ){
        if(ind==0){
            return(x[ind]);
        }
        int misa=max(x,ind-1);
        if(misa>x[ind]){
            return(misa);
        }else{
            return(x[ind]);
        }
      }
}
