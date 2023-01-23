import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter first number
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        // Prompt user to enter an operator
        System.out.print("Enter operator (+, -, /, *): ");
        char ops = input.next().charAt(0);
        
        // Prompt user to enter second number
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        // Calculating the numbers
        if (ops == '+') {
            System.out.println(num1 + num2);
        } else if (ops == '-') {
            System.out.println(num1 - num2);
        } else if (ops == '/') {
            System.out.println(num1 / num2);
        } else if (ops == '*') {
            System.out.println(num1 * num2);
        } else {
            System.out.println("Invalid Operator");
        }

    }
}
