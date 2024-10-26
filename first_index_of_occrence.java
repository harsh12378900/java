package recur;
import java.util.Scanner;
public class first_index_of_occrence {
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
 int  c= occu(array,0);
   System.out.println(c);
 
   } 
   public static int occu(int[] harse,int ind){
    int i=8;
    if(harse[ind]==8){
        return(ind);
    }
int c=occu(harse,ind+1);
return(c);
   }
}
