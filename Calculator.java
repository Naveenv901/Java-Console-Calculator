package Console_Calcluator;

import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n===== Java Console Calculator =====");
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation: (+, -, *, /)");
            char op = sc.next().charAt(0);

            double result = 0;
            boolean valid = true;

            switch (op) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }

            System.out.println("\nDo you want to perform another operation? (Y/N): ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Calculator Closed.");
        sc.close();
    }
}
