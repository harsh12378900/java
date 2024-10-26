package recur;

import java.util.Scanner;

public class revarray {
    public static void rev(int[] array,int ind) {
        if(ind==array.length){
            return;
        }
    rev(array,ind+1);
    System.out.println(array[ind]);
        }
    

    public static void main(String[] args) {
        
      Scanner s=new Scanner(System.in);
      int n,i;
      System.out.println("enter the  size of array");
      n=s.nextInt();
      int[] array=new int[n];
      System.out.println("inputing the element in array");
      for(i=0;i<array.length;i++){
array[i]=s.nextInt();
      }
      rev(array,0);
}
}

