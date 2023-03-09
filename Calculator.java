package HomeWork;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        char oper;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = reader.nextDouble();
        System.out.print("Enter second number: ");
        num2 = reader.nextDouble();
        System.out.println("\nEnter an operator: ");
        System.out.println("1. Sum");
        System.out.println("2. Average");
        System.out.println("3. Compare");
        oper = reader.next().charAt(0);
        switch (oper) {
            case '1' -> System.out.println("The sum result is: " + (num1 + num2));
            case '2' -> System.out.println("The average result is: " + ((num1 + num2) / 2));
            case '3' -> {
                if (num1 == num2) System.out.println(num1 + " is equal to " + num2);
                else System.out.println((Math.max(num1, num2)) + " is greater");
            }
            default -> System.out.println("Error!");
        }

    }
}
