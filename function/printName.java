package java.function;

import java.util.Scanner;

public class printName {
     public static String fun_print_name(String name ){
        return(name);
    }
    public static void main(String[] args) {
        

    @SuppressWarnings("resource")
    Scanner s=new Scanner(System.in);
    System.out.println("enter the name");
String a,c; 
a=s.nextLine();
c=fun_print_name(a);
System.out.println(c);


}
}
