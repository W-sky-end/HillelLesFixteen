package Main;

import org.example.Calculator;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number:  ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = calculator.add(a, b);
                break;
            case '-':
                result = calculator.subtract(a, b);
                break;
            case '*':
                result = calculator.multiply(a, b);
                break;
            case '/':
                try {
                    result = calculator.divide(a, b);
                } catch (IllegalArgumentException e) {
                    System.out.println("Whoopsie! You can't divide by zero. Math doesn't like it.");
                    return;
                }
                break;
            default:
                System.out.println("Hmm... It seems like you entered a funky operation. Let's try something else.");
                return;
        }

        System.out.println("The result of your mathematical magic: " + result);
    }
}