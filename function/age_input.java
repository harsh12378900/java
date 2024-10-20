package java.function;
import java.util.Scanner;
public class age_input {
    public static void vote_eligiblety( int age){
        if(age>18)
        {
            System.out.println("it is eligible to election");
        }
        else{
            System.out.println("it is not eligible to vote");
        }
    
}
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner s=new Scanner(System.in);
    System.out.println("enter the age");
    int age;
     age=s.nextInt();

    vote_eligiblety(age);
}
}
