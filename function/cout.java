package java.function;
import java.util.Scanner;

public class cout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countZeros = 0;

        System.out.println("Enter numbers (type 'stop' to finish): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                if (number == 0) {
                    countZeros++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'stop' to finish.");
            }
        }
        System.out.println("Total number of zeros entered: " + countZeros);
        scanner.close();
    }
}
