package recur;

import java.util.Scanner;

public class printSum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int a, c;
        a = s.nextInt();
        c = print_s(a);
        System.out.println(c);
    }

    public static int print_s(int x) {
        if (x >=0) {
            return (x + print_s(x -1));
        } else {

            return(0);
        }
    }
}
